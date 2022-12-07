

public class Maze {
    char[][] map;
    int length;
    int height;
    int step;
    int target_row;
    int target_col;
    public Maze(){
        String[] map = new String[4];
        map[0] = ".....";
        map[1] = ".   X";
        map[2] = ".   .";
        map[3] = ".....";
        this.height = map.length;
        this.length = map[0].toCharArray().length;
        char[][] maze = new char[this.height][this.length];
        this.step = 0;

        for (int i = 0; i < map.length; i++)
        {
            maze[i]= map[i].toCharArray();
        }
        this.map = maze;
        for (int i = 0; i < this.height; i++)
        {
            for (int j = 0; j < this.length; j++)
            {
                if(this.map[i][j] == 'X'){
                    this.target_row = i;
                    this.target_col = j;
                }
            }
        }
    }
    public void printAll(){
        System.out.println(this.height + " " + this.length + " " + this.step + " /n " + this.map[0][0]);
    }

    public static void main(String[] args) {
        Maze map = new Maze();
        map.printAll();
        System.out.println("HELLO");
    }
}
class Robot{
    int[][] move_to_be_made;
    int[][] origin;
    int current_row;
    int current_col;
    public Robot(int maze_height, int maze_length, int current_row, int current_col){
        this.current_col = current_col;
        this.current_row = current_row;
        int[][] move_to_be_made = new int[maze_height][maze_length];
        int[][] origin = new int[maze_height][maze_length];
        for(int height = 0; height < maze_height; height++){
            for(int length = 0; length < maze_length; length++){
                move_to_be_made[height][length] = 0;
                origin[height][length] = 0;
            }
        }
    }
    public boolean contains(int[] array, int number){
        for (int s : array) {
            if (number == s) {
                return true;
            }
        }
        return false;
    }
    public void update_move_to_be_made(int[][] move_to_be_made, int direction){
        switch(direction){
            case 1:
                if(move_to_be_made )//if all situation => what is the new number
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }
    public boolean Validate_direction(int direction, char[][] map){
        //1 for up, 2 for right, 3 for down, 4 for left, 5 for 1 + 2, 6 for 1 + 3, 7 for 1 + 4, 8 for 2 + 3, 9 for 2 + 4,
        //10 for 3 + 4, 11 for 1 + 2 + 3, 12 for  1 + 2 + 4, 13 for 1 + 3 + 4, 14 for 2 + 3 + 4, 15 for the end no route left
        // return 1 => we can go that direction
        // return 2 => we can't go that direction since there is 1. obstacle, 2. we have go there already
        //3 condition for each case:
        //1. we have not made that move yet
        //2. there is no obstacle there
        //3. we have not been here yet since if we have been here, we can just call a traceback if there is no step to explore anymore
        switch (direction) {
            case 1:
                int[] go_up_direction =  new int[]{1, 5, 6, 7, 11, 12, 13};
                if (!contains(go_up_direction, move_to_be_made[current_row][current_col]) && map[current_row + 1][current_col] != '.' && move_to_be_made[current_row + 1][current_col] == 0) {
                    return true;
                } else return false;
                
            case 2:
                int[] go_down_direction = new int[]{3, 6, 8, 10, 11, 13, 14};
                if (!contains(go_down_direction, move_to_be_made[current_row][current_col]) && map[current_row][current_col + 1] != '.' && move_to_be_made[current_row][current_col + 1] == 0) {
                    return true;
                } else return false;
            case 3:
                int[] go_left_direction = new int[]{4, 7, 9, 10, 12, 13, 14};
                if (!contains(go_left_direction, move_to_be_made[current_row][current_col]) && map[current_row - 1][current_col] != '.' && move_to_be_made[current_row - 1][current_col] == 0) {
                    return true;
                } else return false;
            case 4:
                int[] go_right_direction = new int[]{2, 5, 8, 9, 11, 12, 14};
                if (!contains(go_right_direction, move_to_be_made[current_row][current_col]) && map[current_row][current_col - 1] != '.' && move_to_be_made[current_row][current_col - 1] == 0) {
                    return true;
                } else return false;
        }
        return false;
    }
    public void Navigate(int target_row, int target_col, char[][] map){
        //list contain all the number that if the array have this number => it used to go up

        if(target_row > current_row){
            //go up
            //from origin position
            if(move_to_be_made[current_row][current_col] == 0){
                move_to_be_made[current_row][current_col] = 1; //we save it so that we know we went up next time we checked it here
                this.current_row += 1;
                move_to_be_made[current_row][current_col] = 3;
                origin[current_row][current_col] = 3;
            }
            if(move_to_be_made[current_row][current_col] == 15){ //have go all road that is available => traceback
                if(origin[current_row][current_col] == 1){//the last step we go from the top to under it 1 row => trace back to
                    //above it 1 row
                    current_row += 1;
                }
                if(origin[current_row][current_col] == 2){//the last step we go from the right to left 1 col => trace back to
                    //the right it 1 row
                    current_col += 1;
                }
                if(origin[current_row][current_col] == 3){//the last step we go from the under up 1 row => trace back to
                    //under it 1 row
                    current_row -= 1;
                }
                if(origin[current_row][current_col] == 4){//the last step we go from the right to left 1 col => trace back to
                    //the right 1 col
                    current_col -= 1;
                }
            }
            //not from origin position so check if can we go up or not
            else if(Validate_direction(1, map)){ //did not go up yet
                
                move_to_be_made[current_row][current_col] = 1; //we save it so that we know we went up next time we checked it here

                this.current_row += 1;
                move_to_be_made[current_row][current_col] = 3;
                origin[current_row][current_col] = 3;
            }
            else{ //can not go up => check 3 remaining route
                if(target_col > current_col){ //the target is in the right of the robot
                    //since move to be made =/= 0 so no need to check
                }
            }
        }
    }

}
