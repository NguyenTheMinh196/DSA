public class Maze {
    int rows;
    int cols;
    String[] map;
    int robotRow;
    int robotCol;
    int steps;

    public Maze() {
        // Note: in my real test, I will create much larger
        // and more complicated map
        rows = 8;
        cols = 8;
        map = new String[rows];
        map[0] = ".........";
        map[1] = ".....   .";
        map[2] = "      . .";
        map[3] = ".   . . .";
        map[4] = ". ... . .";
        map[5] = ".   . .X.";
        map[6] = ".........";
        robotRow = 3;
        robotCol = 1;
        steps = 0;
    }

    public String go(String direction) {
        if (!direction.equals("UP") &&
                !direction.equals("DOWN") &&
                !direction.equals("LEFT") &&
                !direction.equals("RIGHT")) {
            // invalid direction
            steps++;
            return "false";
        }
        int currentRow = robotRow;
        int currentCol = robotCol;
        if (direction.equals("UP")) {
            currentRow--;
        } else if (direction.equals("DOWN")) {
            currentRow++;
        } else if (direction.equals("LEFT")) {
            currentCol--;
        } else {
            currentCol++;
        }

        // check the next position
        if (map[currentRow].charAt(currentCol) == 'X') {
            // Exit gate
            steps++;
            System.out.println("Steps to reach the Exit gate " + steps);
            return "win";
        } else if (map[currentRow].charAt(currentCol) == '.') {
            // Wall
            steps++;
            return "false";
        } else {
            // Space => update robot location
            steps++;
            robotRow = currentRow;
            robotCol = currentCol;
            return "true";
        }
    }

    public static void main(String[] args) {
        (new Robot()).Navigate();
    }
}

class Robot{
    int[][] move_to_be_made;
    int[][] origin;
    int current_row;
    int current_col;
    public Robot(){
        int maze_height = 2000;
        int maze_length = 2000;
        this.current_col = 1000;
        this.current_row = 1000;
        int[][] move_to_be_made = new int[maze_height][maze_length];
        int[][] origin = new int[maze_height][maze_length];
        for(int height = 0; height < maze_height; height++){
            for(int length = 0; length < maze_length; length++){
                move_to_be_made[height][length] = 0;
                origin[height][length] = 0;
            }
        }
        this.move_to_be_made = move_to_be_made;
        this.origin= origin;

    }
    public boolean contains(int[] array, int number){
        for (int s : array) {
            if (number == s) {
                return true;
            }
        }
        return false;
    }
    public void update_move_to_be_made(int direction){

        switch(direction){
            case 1:
                if(move_to_be_made[current_row][current_col] == 0){
                    move_to_be_made[current_row][current_col] = direction;
                    break;
                }
                if(move_to_be_made[current_row][current_col] < 11){
                    //if all situation => what is the new number
                    move_to_be_made[current_row][current_col] += 3;//2 go up to 5, 3 go up to 6, 4 go up to 7 , 8 go up to 11,
                    //9 go up to 12, 10 go up to 13
                }
                else if(move_to_be_made[current_row][current_col] == 14){
                    move_to_be_made[current_row][current_col] += 1; //have visited all direction => go up to 15
                }
                break;
            case 2:
                if(move_to_be_made[current_row][current_col] == 0){
                    move_to_be_made[current_row][current_col] = direction;
                    break;
                }
                if(move_to_be_made[current_row][current_col] == 1){
                    move_to_be_made[current_row][current_col] = 5;
                }
                else if(move_to_be_made[current_row][current_col] > 2 && move_to_be_made[current_row][current_col] < 8){
                    move_to_be_made[current_row][current_col] += 5; //3 up to 8, 4 up to 9, 6 to 11, 7 to 12,
                }
                else if(move_to_be_made[current_row][current_col] == 10){
                    move_to_be_made[current_row][current_col] = 14;
                }
                else if(move_to_be_made[current_row][current_col] == 13){
                    move_to_be_made[current_row][current_col] = 15;
                }
                break;
            case 3:
                if(move_to_be_made[current_row][current_col] == 0){
                    move_to_be_made[current_row][current_col] = direction;
                    break;
                }
                if(move_to_be_made[current_row][current_col] < 3){
                    move_to_be_made[current_row][current_col] = move_to_be_made[current_row][current_col]*2 + 4;
                    //1 = 6, 2 = 8, 4
                }
                else if(move_to_be_made[current_row][current_col] > 3 && move_to_be_made[current_row][current_col] < 6){
                    move_to_be_made[current_row][current_col] += 6; //3 up to 8, 4 up to 9, 6 to 11, 7 to 12,
                }
                else if(move_to_be_made[current_row][current_col] == 7){
                    move_to_be_made[current_row][current_col] = 13;
                }
                else if(move_to_be_made[current_row][current_col] == 9){
                    move_to_be_made[current_row][current_col] = 14;
                }
                else if(move_to_be_made[current_row][current_col] == 12){
                    move_to_be_made[current_row][current_col] = 15;
                }
                break;
            case 4:
                if(move_to_be_made[current_row][current_col] == 0){
                    move_to_be_made[current_row][current_col] = direction;
                    break;
                }
                if(move_to_be_made[current_row][current_col] < 3){
                    move_to_be_made[current_row][current_col] = move_to_be_made[current_row][current_col]*2 + 5;
                    //1 = 7, 2 = 9
                }
                else if(move_to_be_made[current_row][current_col] >= 3 && move_to_be_made[current_row][current_col] < 7){
                    move_to_be_made[current_row][current_col] += 7; //3 up to 10, 5 up to 12, 6 to 13,
                }
                else if(move_to_be_made[current_row][current_col] == 8){
                    move_to_be_made[current_row][current_col] = 14;
                }
                else if(move_to_be_made[current_row][current_col] == 11){
                    move_to_be_made[current_row][current_col] = 15;
                }
                break;
        }
    }
    public boolean Validate_direction(int direction){
        //1 for up, 2 for right, 3 for down, 4 for left, 5 for 1 + 2, 6 for 1 + 3, 7 for 1 + 4, 8 for 2 + 3, 9 for 2 + 4,
        //10 for 3 + 4, 11 for 1 + 2 + 3, 12 for  1 + 2 + 4, 13 for 1 + 3 + 4, 14 for 2 + 3 + 4, 15 for the end no route left
        // return 1 => we can go that direction
        // return 2 => we can't go that direction since there is 1. obstacle, 2. we have go there already
        //3 condition for each case:
        //1. we have not made that move yet
        //2. there is no obstacle there (Check in navigate)
        //3. we have not been here yet since if we have been here, we can just call a traceback if there is no step to explore anymore
        if(direction == 1){
            if(current_row+1 != move_to_be_made.length){// reach the limit (something wrong)

                int[] go_up_direction =  new int[]{1, 5, 6, 7, 11, 12, 13};
                if (!contains(go_up_direction, move_to_be_made[current_row][current_col]) && move_to_be_made[current_row + 1][current_col] == 0) {
                    return true;
                } else {update_move_to_be_made(1); return false;}} //cant go down
            else{
                update_move_to_be_made(1); return false;
            }
        }
        if(direction == 2) {
            if (current_col + 1 != move_to_be_made[0].length) {

                int[] go_right_direction = new int[]{2, 5, 8, 9, 11, 12, 14};
//                System.out.println(current_row + " " + current_col + " " + move_to_be_made[current_row][current_col] + " " + move_to_be_made[current_row][current_col +1]);

                if (!contains(go_right_direction, move_to_be_made[current_row][current_col]) && move_to_be_made[current_row][current_col + 1] == 0) {
                    return true;
                } else {
                    update_move_to_be_made(2);
                    return false;
                }
            }
            else{
                update_move_to_be_made(2);
                return false;
            }
        }
        if (direction == 3) {
            if(current_row!= 0) {
                int[] go_down_direction = new int[]{3, 6, 8, 10, 11, 13, 14};
                if (!contains(go_down_direction, move_to_be_made[current_row][current_col]) && move_to_be_made[current_row - 1][current_col] == 0) {
                    return true;
                } else {
                    update_move_to_be_made(3);
                    return false;
                }
            }
            else{
                update_move_to_be_made(3); return false;
            }
        }
        if(direction == 4) {
            if(current_col!= 0){
                int[] go_left_direction = new int[]{4, 7, 9, 10, 12, 13, 14};
                if (!contains(go_left_direction, move_to_be_made[current_row][current_col]) && move_to_be_made[current_row][current_col - 1] == 0) {
                    return true;
                } else {
                    update_move_to_be_made(4);
                    return false;
                }
            }
            else{
                update_move_to_be_made(4); return false;
            }
        }
        return false;
    }
    public String traceback(Maze maze){
        if (origin[current_row][current_col] == 1) {//the last step we go from the top to under it 1 row => trace back to
            //above it 1 row
            current_row += 1;
            return maze.go("DOWN");
        }
        if (origin[current_row][current_col] == 2) {//the last step we go from the left to right 1 col => trace back to
            //the right it 1 row
            current_col += 1;
            return maze.go("RIGHT");
        }
        if (origin[current_row][current_col] == 3) {//the last step we go from the under up 1 row => trace back to
            //under it 1 row
            current_row -= 1;
            return maze.go("UP");
        }
        if (origin[current_row][current_col] == 4) {//the last step we go from the right to left 1 col => trace back to
            //the left 1 col
            current_col -= 1;
            return maze.go("LEFT");
        }
        return "0";
    }
    public void Navigate() {
        //list contain all the number that if the array have this number => it used to go up
        //from origin position
        Maze maze = new Maze();
        String result = "";
        while (!result.equals("win")) {
            if (move_to_be_made[current_row][current_col] == 15) { //have go all road that is available => traceback
                result = traceback(maze);
            } else if (Validate_direction(1)) {
                result = maze.go("DOWN");
                if (result == "true") {
                    update_move_to_be_made(1);
                    this.current_row += 1;
                    update_move_to_be_made(3);
                    origin[current_row][current_col] = 3;
                    continue;
                } else if (result == "win") {
                    continue;
                } else if (result == "false") {
                    update_move_to_be_made(1);
                    if(Validate_direction(2)){
                        result = maze.go("RIGHT");
                        if (result == "true") {
                            update_move_to_be_made(2);
                            this.current_col += 1;
                            update_move_to_be_made(4);
                            origin[current_row][current_col] = 4;
                            continue;

                        } else if (result == "win") {
                            continue;
                        } else if (result == "false") {
                            update_move_to_be_made(2);
                            if (Validate_direction(3)) {
                                result = maze.go("UP");
                                if (result == "true") {
                                    update_move_to_be_made(3);
                                    this.current_row -= 1;
                                    update_move_to_be_made(1);
                                    origin[current_row][current_col] = 1;
                                    continue;
                                } else if (result == "win") {
                                    continue;
                                } else if (result == "false") {
                                    update_move_to_be_made(3);
                                    if (Validate_direction(4)) {
                                        result = maze.go("LEFT");
                                        if (result == "true") {
                                            update_move_to_be_made(4);
                                            this.current_col -= 1;
                                            update_move_to_be_made(2);
                                            origin[current_row][current_col] = 2;
                                            continue;

                                        } else if (result == "win") {
                                            continue;
                                        } else if (result == "false") {
                                            update_move_to_be_made(4);
                                            traceback(maze);
                                            continue;
                                        }
                                        continue;
                                    }
                                }
                                continue;
                            }
                        }
                    continue;
                    }
                }
            } else if (Validate_direction(2)) {
                result = maze.go("RIGHT");
                if (result == "true") {
//                    System.out.println("HEYYYY YEEYE" + current_row + " " + current_col + " " + move_to_be_made[current_row][current_col] + " " + move_to_be_made[current_row +1][current_col]);

                    update_move_to_be_made(2);
                    this.current_col += 1;
                    update_move_to_be_made(4);
                    origin[current_row][current_col] = 4;
//                    System.out.println("HEYYYY YEEYE" + current_row + " " + current_col + " " + move_to_be_made[current_row][current_col] + " " + move_to_be_made[current_row +1][current_col]);

                    continue;

                } else if (result == "win") {
                    continue;
                } else if (result == "false") {
                    update_move_to_be_made(2);
                    if (Validate_direction(3)) {
                        result = maze.go("UP");
                        if (result == "true") {
                            update_move_to_be_made(3);
                            this.current_row -= 1;
                            update_move_to_be_made(1);
                            origin[current_row][current_col] = 1;
                            continue;

                        } else if (result == "win") {
                            continue;
                        } else if (result == "false") {
                            update_move_to_be_made(3);
                            if (Validate_direction(4)) {
                                result = maze.go("LEFT");
                                if (result == "true") {
                                    update_move_to_be_made(4);
                                    this.current_col -= 1;
                                    update_move_to_be_made(2);
                                    origin[current_row][current_col] = 2;
                                    continue;

                                } else if (result == "win") {
                                    continue;
                                } else if (result == "false") {
                                    update_move_to_be_made(4);
                                    traceback(maze);
                                    continue;
                                }
                                continue;
                            }
                            continue;
                        }
                        continue;
                    }
                    continue;
                }
            } else if (Validate_direction(3)) {
                result = maze.go("UP");
                if (result == "true") {
                    update_move_to_be_made(3);
                    this.current_row -= 1;
                    update_move_to_be_made(1);
                    origin[current_row][current_col] = 1;
                    continue;
                } else if (result == "win") {
                    continue;
                } else if (result == "false") {
                    update_move_to_be_made(3);
                    if (Validate_direction(4)) {
                        result = maze.go("LEFT");
                        if (result == "true") {
                            update_move_to_be_made(4);
                            this.current_col -= 1;
                            update_move_to_be_made(2);
                            origin[current_row][current_col] = 2;
                            continue;

                        } else if (result == "win") {
                            continue;
                        } else if (result == "false") {
                            update_move_to_be_made(4);
                            traceback(maze);
                            continue;
                        }
                        continue;
                    }
                    continue;
                }
            } else if (Validate_direction(4)) {
                result = maze.go("LEFT");
                if (result == "true") {
                    update_move_to_be_made(4);
                    this.current_col -= 1;
                    update_move_to_be_made(2);
                    origin[current_row][current_col] = 2;
                    continue;

                } else if (result == "win") {
                    continue;
                } else if (result == "false") {
                    update_move_to_be_made(4);
                    traceback(maze);
                    continue;
                }
            } else {
                result = traceback(maze);
            }
        }
    }
}