//import java.util.Stack;
//
//public class Maze {
//    String[] map;
//    int rows;
//    int cols;
//    int steps;
//    int robotCol;
//    int robotRow;
//
//    public Maze() {
//        String[] map = new String[7];
//        map[0] = "........";
//        map[1] = "..... .X";
//        map[2] = "    . . ";
//        map[3] = ".   . . ";
//        map[4] = ". ...   ";
//        map[5] = ".       ";
//        map[6] = "........";
//        this.rows = map.length;
//        this.cols = map[0].toCharArray().length;
//        this.steps = 0;
//        this.robotCol = 1;
//        this.robotRow = 3;
//        this.map = map;
////        for (int i = 0; i < map.length; i++) {
////            maze[i] = map[i].toCharArray();
////        }
////        this.map = maze;
////        for (int i = 0; i < this.height; i++) {
////            for (int j = 0; j < this.length; j++) {
////                if (this.map[i][j] == 'X') {
////                    this.target_row = i;
////                    this.target_col = j;
////                }
////            }
////        }
//    }
//
//    public String go(String direction) {
//        if (!direction.equals("UP") &&
//                !direction.equals("DOWN") &&
//                !direction.equals("LEFT") &&
//                !direction.equals("RIGHT")) {
//            // invalid direction
//            steps++;
//            return "false";
//        }
//        int currentRow = robotRow;
//        int currentCol = robotCol;
//        if (direction.equals("UP")) {
//            currentRow--;
//        } else if (direction.equals("DOWN")) {
//            currentRow++;
//        } else if (direction.equals("LEFT")) {
//            currentCol--;
//        } else {
//            currentCol++;
//        }
//
//        // check the next position
//        if (map[currentRow].charAt(currentCol) == 'X') {
//            // Exit gate
//            steps++;
//            System.out.println("Steps to reach the Exit gate " + steps);
//            return "win";
//        } else if (map[currentRow].charAt(currentCol) == '.') {
//            // Wall
//            steps++;
//            return "false";
//        } else {
//            // Space => update robot location
//            steps++;
//            robotRow = currentRow;
//            robotCol = currentCol;
//            return "true";
//        }
//    }
//
//
////MADE BY NGUYENTHEMINH master 12/9/2022
//    public static void main(String[] args) {
//        Maze map = new Maze();
//        Robot robot = new Robot();
////        System.out.println(map.target_row + " " + map.target_col);
//        stack A = new stack(10);
//        A.push(1);
//        A.push(2);
//        A.push(3);
//        System.out.println(A.A[A.top]);
//        System.out.println(A.toString());
////        A.pop();
//        A.empty();
//        System.out.println(A.A[A.top]);
//        A.toString();
////        robot.Navigate(map);
//        robot.update_move_to_be_made(1, A);
//        robot.update_move_to_be_made(2, A);
//        robot.update_move_to_be_made(4, A);
//
//        System.out.println(A.toString());
//
//
////        int last_position = -1;
////        while(map.map[robot.current_row][robot.current_col] != 'X'){
////            robot.Navigate(map.target_row, map.target_col, map.map);
////            System.out.println(robot.move_to_be_made[robot.current_row][robot.current_col] + " " + robot.origin[robot.current_row][robot.current_col] + " " + robot.current_row + " " + robot.current_col);
////            System.out.println(" ");
////            if(robot.current_col + robot.current_row == last_position){
////                System.out.println("There is no way out");
////                for(int height = 0; height < map.height; height++){
////                    System.out.println("ROW " + height);
////                    for(int length = 0; length < map.length; length++){
////                        System.out.println(robot.move_to_be_made[height][length]);
//
////                        robot.origin[height][length] = 0;
////                    }
////                }
////                break;
//
////            }
////            else{
////                last_position = robot.current_col + robot.current_row;
//////                System.out.println("Step + 1");
////                map.step+=1;
////            }
//
////        }
////        System.out.println(map.step);
//
//    }
//}
//class Robot {
//    past_movement past_movement;
//    int current_row;
//    int current_col;
//    stack move_to_be_made;
//    stack origin;
//
//    public Robot() {
//        this.current_col = 0;
//        this.current_row = 0;
//        stack move_to_be_made2 = new stack(10);
//        stack origin2 = new stack(10);
//        past_movement A = new past_movement();
//        this.move_to_be_made = move_to_be_made2;
//        this.origin = origin2;
//        this.past_movement = A;
//
////        int[][] move_to_be_made = new int[maze_height][maze_length];
////        int[][] origin = new int[maze_height][maze_length];
////        for(int height = 0; height < maze_height; height++){
////            for(int length = 0; length < maze_length; length++){
////                move_to_be_made[height][length] = 0;
////                origin[height][length] = 0;
////            }
////        }
////        this.move_to_be_made = move_to_be_made;
////        this.origin= origin;
////        System.out.println(move_to_be_made);
////        System.out.println(origin);
////
//    }
//
//    public boolean contains(int[] array, int number) {
//        for (int s : array) {
//            if (number == s) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public void update_move_to_be_made(int direction, stack A) {
////update because we have already updated it
//        switch (direction) {
//            case 1:
//                if (A.top() == 0) {
//                    A.push(direction);
//                    break;
//                }
//                if (A.A[A.top] < 11) {
//                    //if all situation => what is the new number
////                    System.out.println(A.A[A.top] + " TO 16 and why");
//                    A.A[A.top] += 3;//2 go up to 5, 3 go up to 6, 4 go up to 7 , 8 go up to 11,
//                    //9 go up to 12, 10 go up to 13
//                } else if (A.A[A.top] == 14) {
//                    A.A[A.top] += 1; //have visited all direction => go up to 15
//                }
//                break;
//            case 2:
//                if (A.top() == 0) {
//                    A.push(direction);
//                    break;
//                }
//                if (A.A[A.top] == 1) {
//                    A.A[A.top] = 5;
//                } else if (A.A[A.top] > 2 && A.A[A.top] < 8) {
//                    A.A[A.top] += 5; //3 up to 8, 4 up to 9, 6 to 11, 7 to 12,
//                } else if (A.A[A.top] == 10) {
//                    A.A[A.top] = 14;
//                } else if (A.A[A.top] == 13) {
//                    A.A[A.top] = 15;
//                }
//                break;
//            case 3:
//                if (A.top() == 0) {
//                    A.push(direction);
//                    break;
//                }
//                if (A.A[A.top] < 3) {
//                    A.A[A.top] = A.A[A.top] * 2 + 4;
//                    //1 = 6, 2 = 8, 4
//                } else if (A.A[A.top] > 3 && A.A[A.top] < 6) {
//                    A.A[A.top] += 6; //3 up to 8, 4 up to 9, 6 to 11, 7 to 12,
//                } else if (A.A[A.top] == 7) {
//                    A.A[A.top] = 13;
//                } else if (A.A[A.top] == 9) {
//                    A.A[A.top] = 14;
//                } else if (A.A[A.top] == 12) {
//                    A.A[A.top] = 15;
//                }
//                break;
//            case 4:
//                if (A.top() == 0) {
//                    A.push(direction);
//                    break;
//                }
//                if (A.A[A.top] < 3) {
//                    A.A[A.top] = A.A[A.top] * 2 + 5;
//                    //1 = 7, 2 = 9
//                } else if (A.A[A.top] >= 3 && A.A[A.top] < 7) {
//                    A.A[A.top] += 7; //3 up to 10, 5 up to 12, 6 to 13,
//                } else if (A.A[A.top] == 8) {
//                    A.A[A.top] = 14;
//                } else if (A.A[A.top] == 11) {
//                    A.A[A.top] = 15;
//                }
//                break;
//        }
//    }
//
//    public boolean Validate_direction(int direction, stack move_to_be_made, past_movement past_movement) {
//        //1 for down, 2 for right, 3 for up, 4 for left, 5 for 1 + 2, 6 for 1 + 3, 7 for 1 + 4, 8 for 2 + 3, 9 for 2 + 4,
//        //10 for 3 + 4, 11 for 1 + 2 + 3, 12 for  1 + 2 + 4, 13 for 1 + 3 + 4, 14 for 2 + 3 + 4, 15 for the end no route left
//        // return 1 => we can go that direction
//        // return 2 => we can't go that direction since there is 1. obstacle, 2. we have go there already
//        //3 condition for each case:
//        //1. we have not made that move yet
//        //2. there is no obstacle there
//        //3. we have not been here yet since if we have been here, we can just call a traceback if there is no step to explore anymore
////        String result = "";
////        while (!result.equals("win")) {
//
//        if (direction == 1) {
//            int[] go_up_direction = new int[]{1, 5, 6, 7, 11, 12, 13};
//            if (!contains(go_up_direction, move_to_be_made.top()) && past_movement.get_element(this.current_row+1, this.current_col) != 'x') {
//                return true;
//            } else {
//                update_move_to_be_made(1, move_to_be_made);
//                return false;
//            }
//        }
//
//        if (direction == 2) {
//            int[] go_right_direction = new int[]{2, 5, 8, 9, 11, 12, 14};
//            if (!contains(go_right_direction, move_to_be_made.top()) && past_movement.get_element(this.current_row, this.current_col+1) != 'x') {
//                return true;
//            } else {
//                update_move_to_be_made(2, move_to_be_made);
//                return false;
//            }
//        }
//        if (direction == 3) {
////                System.out.println(map[current_row][current_col+1]!= '.');
////                System.out.println(move_to_be_made[current_row][current_col]);
////                System.out.println(move_to_be_made[current_row][current_col + 1]);
//            int[] go_down_direction = new int[]{3, 6, 8, 10, 11, 13, 14};
//            if (!contains(go_down_direction, move_to_be_made.top()) && past_movement.get_element(this.current_row-1, this.current_col) != 'x') {
////                System.out.println(move_to_be_made.top() + " ... " + past_movement.get_element(this.current_row-1, this.current_col) + current_row + current_col);
//                return true;
//            } else {
//                update_move_to_be_made(3, move_to_be_made);
//                return false;
//            }
//        }
//
//        if (direction == 4) {
//            int[] go_left_direction = new int[]{4, 7, 9, 10, 12, 13, 14};
//            if (!contains(go_left_direction, move_to_be_made.top()) && past_movement.get_element(this.current_row, this.current_col-1) != 'x') {
////                System.out.println(move_to_be_made.top() + " ... " + past_movement.get_element(this.current_row, this.current_col-1) + current_row + current_col);
//
//                return true;
//            } else {
//                update_move_to_be_made(4, move_to_be_made);
//                return false;
//            }
//
//        }
//        return false;
//    }
//
//    public void traceback(Maze maze) {
//        if (origin.top() == 1) {//the last step we go from the top to under it 1 row => trace back to
//            //above it 1 row
//            maze.go("DOWN");
//            current_row += 1;
//            move_to_be_made.pop();
//            origin.pop();
////            current_row += 1;
//        }
//        if (origin.top() == 2) {//the last step we go from the left to right 1 col => trace back to
//            //the right it 1 row
//            maze.go("RIGHT");
//            current_col +=1;
//            move_to_be_made.pop();
//            origin.pop();
////            current_col += 1;
//        }
//        if (origin.top() == 3) {//the last step we go from the under up 1 row => trace back to
//            //under it 1 row
//            maze.go("UP");
//            current_row -=1;
//            move_to_be_made.pop();
//            origin.pop();
////            current_row -= 1;
//        }
//        if (origin.top() == 4) {//the last step we go from the right to left 1 col => trace back to
//            //the left 1 col
//            maze.go("LEFT");
//            current_col -= 1;
//            move_to_be_made.pop();
//            origin.pop();
////            current_col -= 1;
//        }
//    }
//
//    public void Navigate(Maze maze) {
//        //list contain all the number that if the array have this number => it used to go up
//        //from origin position
//        //go up
//        String result = new String("true");
//        while (result != "win") {
////            System.out.println("1 " + current_row + " " + current_col + "..");
//
//            if (move_to_be_made.top() == 15) {
//                traceback(maze);
//                continue;
//            } else if (Validate_direction(1, move_to_be_made, past_movement)) //we can go up,
//            {
//                update_move_to_be_made(1, move_to_be_made);
//                result = maze.go("DOWN");
//                if (result == "true") { //update maze
//                    this.current_row += 1; //update robot
//                    past_movement.update_past_movement(1, this.current_row);
//                    //update past movement
//                    this.origin.push(3);
//                    this.move_to_be_made.push(3);
//                    past_movement.add_element('x', this.current_row, this.current_col);
//                }
//                else{
//                    result = maze.go("UP");
//                }
//                continue;
//            } else if (Validate_direction(2, move_to_be_made, past_movement)) //we can go up,
//            {
//                update_move_to_be_made(2, move_to_be_made);
//                result = maze.go("RIGHT");
//                if (result == "true") { //update maze
//                    this.current_col += 1; //update robot
//                    past_movement.update_past_movement(2, this.current_row);
//                    //update past movement
//                    this.origin.push(4);
//                    this.move_to_be_made.push(4);
//                    past_movement.add_element('x', this.current_row, this.current_col);
//                }
//                else{
//                    result = maze.go("LEFT");
//                }
//                continue;
//            } else if (Validate_direction(3, move_to_be_made, past_movement)) //we can go up,
//            {
//                update_move_to_be_made(3, move_to_be_made);
//                result = maze.go("UP");
//                if (result == "true") { //update maze
//                    this.current_row -= 1; //update robot
//                    past_movement.update_past_movement(3, this.current_row);
//                    //update past movement
//                    this.origin.push(1);
//                    past_movement.add_element('x', this.current_row, this.current_col);
//                    this.move_to_be_made.push(1);
//                }
//                else{
//                    result = maze.go("DOWN");
//                }
//                continue;
//            } else if (Validate_direction(4, move_to_be_made, past_movement)) //we can go up,
//            {
//                update_move_to_be_made(4, move_to_be_made);
//                result = maze.go("LEFT");
//                if ( result == "true") { //update maze
//                    this.current_col -= 1; //update robot
//                    past_movement.update_past_movement(4, this.current_row);
//                    //update past movement
//                    this.origin.push(2);
//                    this.move_to_be_made.push(2);
//                    past_movement.add_element('x', this.current_row, this.current_col);
//                }
//                else{
//                    result = maze.go("RIGHT");
//                }
//                continue;
//            }
//            else{
//                traceback(maze);
//                continue;
//            }
//
//        }
//
//
//    }
//}
//class stack{
//    // Empty array list
//    int[] A;
//    // Default value of top variable when stack is empty
//    int top = -1;
//    // Variable to store size of array
//    int size;
//    // Constructor of this class
//    // To initialize stack
//    public stack(int size)
//    {
//        // Storing the value of size into global variable
//        this.size = size;
//        // Creating array of Size = size
//        this.A = new int[size];
//    }
//
//    // Method 1
//    // To push generic element into stack
//    void push(int X)
//    {
//        // Checking if array is full
//        if (top + 1 == size) {
//            // Display message when array is full
//            System.out.println("Stack Overflow");
//            size = size*2;
//            int[] A2 = new int[size];
//            for(int a = 0; a < A.length; a++){
//                A2[a] = A[a];
//            }
//            A2[top+1] = X;
//            A = A2;
//            top+= 1;
//        }
//        else {
//            // Increment top to go to next position
//            top = top + 1;
//            // Over-writing existing element
//            if (A.length > top)
//                A[top] = X;
//            else
//                // Creating new element
//                A[top] = X;
//        }
//    }
//    // Method 2
//    // To return topmost element of stack
//    int top()
//    {
//        // If stack is empty
//        if (top == -1) {
//            // Display message when there are no elements in
//            // the stack
////            System.out.println("Stack Underflow");
//            return 0;
//        }
//        // else elements are present so
//        // return the topmost element
//        else
//            return A[top];
//    }
//
//    // Method 3
//    // To delete last element of stack
//    void pop()
//    {
//        // If stack is empty
//        if (top == -1) {
//            // Display message when there are no elements in
//            // the stack
//            System.out.println("Stack Underflow");
//        }
//        else
//            // Delete the last element
//            // by decrementing the top
//            top--;
//    }
//
//    // Method 4
//    // To check if stack is empty or not
//    boolean empty() { return top == -1; }
//    // Method 5
//    // To print the stack
//    // @Override
//    public String toString()
//    {
//        String Ans = "";
//        for (int i = 0; i < top; i++) {
//            Ans += String.valueOf(A[i]) + "->";
//        }
//        Ans += String.valueOf(A[top]);
//        return Ans;
//    }
//}
//class past_movement{
//    char[][] past_movement;
//    int length;
//    int height;
//    int min_height;
//    int max_height;
//    int min_length;
//    int max_length;
//    public past_movement(){
//        this.height = 20;
//        this.length = 20;
//        this.past_movement = new char[this.height][this.length];
//        for(int a = 0; a < this.height; a ++){
//            for(int b = 0; b < this.length; b++){
//                this.past_movement[a][b] = ' ';
//                //putting it in the middle
//            }
//        }
//        this.min_height = 0;
//        this.min_length = 0;
//        this.max_height = 0;
//        this.max_length = 0;
//    }
//    public void update_past_movement(int type, int value){
//        if(type == 3){
//            //update min height
//            this.min_height -= 1;
//            this.height = this.max_height - this.min_height;
//            //since min height will be < 0;
//        }
//        else if(type == 4){
//            //update min length
//            this.min_length -= 1;
//            this.length = this.max_length - this.min_length;
//            //since min length will be < 0;
//        }
//        else if(type == 2){
//            this.max_length += 1;
//            this.length = this.max_length - this.min_length;
//        }
//        else if(type == 1){
//            this.max_height += 1;
//            this.height = this.max_height - this.min_height;
//        }
//    }
//    public void add_element(char value, int row, int column){
//        checksize();
//        this.past_movement[this.past_movement.length/2 + row][this.past_movement[0].length/2 + column] = value;
//    }
//    public char get_element(int row, int column){
//        return this.past_movement[this.past_movement.length/2 + row][this.past_movement[0].length/2 + column];
//    }
//    public void checksize(){
//        if(this.past_movement.length/2 <= Math.abs(this.min_height) || this.past_movement.length/2 <= this.max_height ||
//                this.past_movement[0].length/2 <= Math.abs(this.min_length) || this.past_movement[0].length/2 <= this.max_length
//        ){
//            update();
//        }
//    }
//    public void update(){
//        if(this.past_movement.length/2 <= height || this.past_movement[0].length/2 <= length){
//            char[][] new_past_movement = new char[this.past_movement.length*2][this.past_movement[0].length*2];
//            for(int a = 0; a < this.past_movement.length; a ++){
//                for(int b = 0; b < this.past_movement[0].length; b++){
//                    new_past_movement[this.past_movement.length+a][this.past_movement[0].length+b] = this.past_movement[a][b];
//                //putting it in the middle
//                }
//            }
//            this.past_movement = new_past_movement;
//        }
//    }
//}

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
//public class Maze {
//    char[][] map;
//    int length;
//    int height;
//    int step;
//    int target_row;
//    int target_col;
//    public Maze(){
//        String[] map = new String[7];
//        map[0] = "........";
//        map[1] = "..... .X";
//        map[2] = "    . . ";
//        map[3] = ".   . . ";
//        map[4] = ". ...   ";
//        map[5] = ".       ";
//        map[6] = "........";
//        this.height = map.length;
//        this.length = map[0].toCharArray().length;
//        char[][] maze = new char[this.height][this.length];
//        this.step = 0;
//
//        for (int i = 0; i < map.length; i++)
//        {
//            maze[i]= map[i].toCharArray();
//        }
//        this.map = maze;
//        for (int i = 0; i < this.height; i++)
//        {
//            for (int j = 0; j < this.length; j++)
//            {
//                if(this.map[i][j] == 'X'){
//                    this.target_row = i;
//                    this.target_col = j;
//                }
//            }
//        }
//    }
//    public void printAll(){
//        System.out.println(this.height + " " + this.length + " " + this.step + " /n " + this.map[0][0]);
//    }
//    //MADE BY NGUYENTHEMINH master 12/9/2022
//    public static void main(String[] args) {
//        Maze map = new Maze();
//        Robot robot = new Robot();
//        System.out.println(map.target_row + " " + map.target_col);
//        int last_position = -1;
//        while(map.map[robot.current_row][robot.current_col] != 'X'){
//            robot.Navigate(map.target_row, map.target_col, map.map);
//            System.out.println(robot.move_to_be_made[robot.current_row][robot.current_col] + " " + robot.origin[robot.current_row][robot.current_col] + " " + robot.current_row + " " + robot.current_col);
//            System.out.println(" ");
//            if(robot.current_col + robot.current_row == last_position){
//                System.out.println("There is no way out");
//                for(int height = 0; height < map.height; height++){
//                    System.out.println("ROW " + height);
//                    for(int length = 0; length < map.length; length++){
//                        System.out.println(robot.move_to_be_made[height][length]);
//
////                        robot.origin[height][length] = 0;
//                    }
//                }
//                break;
//
//            }
//            else{
//                last_position = robot.current_col + robot.current_row;
////                System.out.println("Step + 1");
//                map.step+=1;
//            }
//
//        }
//        System.out.println("HELLO");
//    }
//}
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
//        System.out.println(move_to_be_made);
//        System.out.println(origin);
//
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
//                    System.out.println(move_to_be_made[current_row][current_col] + " TO 16 and why");
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
        //2. there is no obstacle there
        //3. we have not been here yet since if we have been here, we can just call a traceback if there is no step to explore anymore
        if(direction == 1){
            if(current_row+1 != move_to_be_made.length){// reach the limit (something wrong)
//                System.out.println("yes123 ");
                System.out.println(current_row + " " + current_col + " " + move_to_be_made[current_row][current_col] + " " + move_to_be_made[current_row +1][current_col]);

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
                System.out.println(current_row + " " + current_col + " " + move_to_be_made[current_row][current_col] + " " + move_to_be_made[current_row][current_col +1]);

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
                System.out.println(current_row + " " + current_col + " " + move_to_be_made[current_row][current_col] + " " + move_to_be_made[current_row -1][current_col]);

//                System.out.println(map[current_row][current_col+1]!= '.');
//                System.out.println(move_to_be_made[current_row][current_col]);
//                System.out.println(move_to_be_made[current_row][current_col + 1]);
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
                System.out.println(current_row + " " + current_col + " " + move_to_be_made[current_row][current_col] + " " + move_to_be_made[current_row][current_col-1]);

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
//        System.out.println(origin[current_row][current_col]);
//        System.out.println("RAN");
//        System.out.println(origin[current_row][current_col]);
        if (origin[current_row][current_col] == 1) {//the last step we go from the top to under it 1 row => trace back to
            //above it 1 row
            System.out.println("Traceback down ") ;
            current_row += 1;
            return maze.go("DOWN");
        }
        if (origin[current_row][current_col] == 2) {//the last step we go from the left to right 1 col => trace back to
            //the right it 1 row
            System.out.println("Traceback right ") ;
            current_col += 1;
            return maze.go("RIGHT");
        }
        if (origin[current_row][current_col] == 3) {//the last step we go from the under up 1 row => trace back to
            //under it 1 row
            System.out.println("Traceback up ") ;
            current_row -= 1;
            return maze.go("UP");
        }
        if (origin[current_row][current_col] == 4) {//the last step we go from the right to left 1 col => trace back to
            //the left 1 col
            System.out.println("Traceback left ") ;
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
//        while (maze.steps< 100) {
//        for(int i = 0; i < 15; i ++){
            System.out.println("HEYYYY YEEYE" + current_row + " " + current_col + " " + move_to_be_made[current_row][current_col] + " " + move_to_be_made[current_row +1][current_col]);
            if (move_to_be_made[current_row][current_col] == 15) { //have go all road that is available => traceback
                result = traceback(maze);
            } else if (Validate_direction(1)) {
                System.out.println("yes 1");
                result = maze.go("DOWN");
                if (result == "true") {
                    update_move_to_be_made(1);
                    this.current_row += 1;
                    update_move_to_be_made(3);
                    origin[current_row][current_col] = 3;
                    System.out.println(current_row + " " + current_col + " " + move_to_be_made[current_row][current_col] + " " + move_to_be_made[current_row+1][current_col]);
                    continue;
                } else if (result == "win") {
                    continue;
                } else if (result == "false") {
                    update_move_to_be_made(1);
                    if(Validate_direction(2)){
                        result = maze.go("RIGHT");
                        if (result == "true") {
//                    System.out.println("HEYYYY YEEYE" + current_row + " " + current_col + " " + move_to_be_made[current_row][current_col] + " " + move_to_be_made[current_row +1][current_col]);

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
                                System.out.println("Yes 3");
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
                                        System.out.println("Yes 4");
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
                System.out.println("Yes 2");
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
                        System.out.println("Yes 4");
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
                                System.out.println("Yes 4");
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
                System.out.println("Yes 3");
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
                        System.out.println("Yes 4");
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
                System.out.println("Yes 4");
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
                System.out.println("Yes 5");
                result = traceback(maze);
            }
            System.out.println(current_row + " " + current_col + " " + move_to_be_made[current_row][current_col] + " " + move_to_be_made[current_row +1][current_col]);

//            System.out.println(current_row + " " + current_col);
//        if (move_to_be_made[current_row][current_col] == 0) {
//            update_move_to_be_made(1); //we save it so that we know we went up next time we checked it here
//            this.current_row += 1;
//            update_move_to_be_made(3);
//            origin[current_row][current_col] = 3;
//        }
            //go all route already


//        } else if (target_row > current_row) {
//            //go up
//            //not from origin position so check if can we go up or not
//            if (Validate_direction(1, map)) { //did not go up yet
//                System.out.println("1");
//                update_move_to_be_made(1); //we save it so that we know we went up next time we checked it here
//                this.current_row += 1;
//                update_move_to_be_made(3);
//                origin[current_row][current_col] = 3;
//            } else { //can not go up => check 3 remaining route
//                if (target_col > current_col) { //the target is in the right of the robot
//                    //since move to be made =/= 0 so no need to check
//                    if (Validate_direction(2, map)) {
//                        System.out.println("2");
//                        update_move_to_be_made(2); //we save it so that we know we went up next time we checked it here
//                        this.current_col += 1;
//                        update_move_to_be_made(4);
//                        origin[current_row][current_col] = 4;
//                    } else { //cannot go right
//                        System.out.println("4");
//                        if (Validate_direction(4, map)) { //can we go left?
//                            update_move_to_be_made(4);
//                            this.current_col -= 1;
//                            update_move_to_be_made(2);
//                            origin[current_row][current_col] = 2;
//                        }
//                        else if (Validate_direction(3, map)) { //can we go up?
//                            System.out.println("3");
//                            update_move_to_be_made(3);
//                            this.current_row -= 1;
//                            update_move_to_be_made(1);
//                            origin[current_row][current_col] = 1;
//                        }
//                        else{
//                            traceback();
//                        }
//                    }
//                }
//                else {
//                    if (Validate_direction(4, map)) {
////                        System.out.println("2");
//                        update_move_to_be_made(4); //we save it so that we know we went up next time we checked it here
//                        this.current_col += 1;
//                        update_move_to_be_made(2);
//                        origin[current_row][current_col] = 2;
//                    } else { //cannot go right
////                        System.out.println("4");
//                        if (Validate_direction(2, map)) { //can we go left?
//                            update_move_to_be_made(2);
//                            this.current_col -= 1;
//                            update_move_to_be_made(4);
//                            origin[current_row][current_col] = 4;
//                        } else if (Validate_direction(3, map)) { //can we go down?
////                            System.out.println("3");
//                            update_move_to_be_made(3);
//                            this.current_row -= 1;
//                            update_move_to_be_made(1);
//                            origin[current_row][current_col] = 1;
//                        } else {
//                            traceback();
//                        }
//                    }
//                }
//            }
//        } else if (target_row < current_row) {
//            //go down
//            //not from origin position so check if can we go down or not
//            if (Validate_direction(3, map)) { //did not go up yet
//                System.out.println(move_to_be_made[current_row][current_col]);
//                update_move_to_be_made(3); //we save it so that we know we went up next time we checked it here
//                System.out.println(move_to_be_made[current_row][current_col]);
//
//                this.current_row -= 1;
//                update_move_to_be_made(1);
//                origin[current_row][current_col] = 1;
//            } else { //can not go up => check 3 remaining route
//                if (target_col > current_col) { //the target is in the right of the robot
//                    //since move to be made =/= 0 so no need to check
//                    if (Validate_direction(2, map)) {
//                        System.out.println(move_to_be_made[current_row][current_col]);
//                        update_move_to_be_made(2); //we save it so that we know we went up next time we checked it here
//                        System.out.println(move_to_be_made[current_row][current_col]);
//
//                        this.current_col += 1;
//                        update_move_to_be_made(4);
//                        origin[current_row][current_col] = 4;
//                    } else {
//                        if (Validate_direction(4, map)) {
//                            System.out.println(move_to_be_made[current_row][current_col]);
//                            update_move_to_be_made(4);
//                            System.out.println(move_to_be_made[current_row][current_col]);
//
//                            this.current_col -= 1;
//                            update_move_to_be_made(2);
//                            origin[current_row][current_col] = 2;
//                        }
//                        else if (Validate_direction(1, map)) {
//                            System.out.println(move_to_be_made[current_row][current_col]);
//                            update_move_to_be_made(1);
//                            System.out.println(move_to_be_made[current_row][current_col]);
//
//                            this.current_row += 1;
//                            update_move_to_be_made(3);
//                            origin[current_row][current_col] = 3;
//                        }
//                        else{
////                            System.out.println(move_to_be_made[current_row][current_col]);
////                            System.out.println(origin[current_row][current_col]);
//                            traceback();
//                        }
//                    }
//                }
//                else{
//                    if (Validate_direction(4, map)) {
//                        update_move_to_be_made(4); //we save it so that we know we went up next time we checked it here
//                        this.current_col -= 1;
//                        update_move_to_be_made(2);
//                        origin[current_row][current_col] = 2;
//                    } else {
//                        if (Validate_direction(2, map)) {
//                            update_move_to_be_made(2);
//                            this.current_col += 1;
//                            update_move_to_be_made(4);
//                            origin[current_row][current_col] = 4;
//                        }
//                        else if (Validate_direction(1, map)) {
//                            update_move_to_be_made(1);
//                            this.current_row += 1;
//                            update_move_to_be_made(3);
//                            origin[current_row][current_col] = 3;
//                        }
//                        else{
//                            traceback();
//                        }
//                    }
//                }
//            }
//        }
//        else if(target_row == current_row){
//            if (target_col > current_col) { //the target is in the right of the robot
//                //since move to be made =/= 0 so no need to check
//                if (Validate_direction(2, map)) {
//                    System.out.print("2");
//                    update_move_to_be_made(2); //we save it so that we know we went up next time we checked it here
//                    this.current_col += 1;
//                    update_move_to_be_made(4);
//                    origin[current_row][current_col] = 4;
//                } else {
//                    if (Validate_direction(4, map)) {
//                        System.out.print("4");
//                        update_move_to_be_made(4);
//                        this.current_col -= 1;
//                        update_move_to_be_made(2);
//                        origin[current_row][current_col] = 2;
//                    }
//                    else if (Validate_direction(1, map)) {
//                        System.out.print("1");
//
//                        update_move_to_be_made(1);
//                        this.current_row += 1;
//                        update_move_to_be_made(3);
//                        origin[current_row][current_col] = 3;
//                    }
//                    else if (Validate_direction(3, map)) {
//                        System.out.print("3");
//
//                        update_move_to_be_made(3);
//                        this.current_row -= 1;
//                        update_move_to_be_made(1);
//                        origin[current_row][current_col] = 1;
//                    }
//                    else{
//                        traceback();
//                    }
//                }
//            }
//            else{
//                if (Validate_direction(4, map)) {
//                    System.out.print("4.2");
//
//                    update_move_to_be_made(4); //we save it so that we know we went up next time we checked it here
//                    this.current_col -= 1;
//                    update_move_to_be_made(2);
//                    origin[current_row][current_col] = 2;
//                } else {
//                    if (Validate_direction(2, map)) {
//                        System.out.print("2.2");
//                        update_move_to_be_made(2);
//                        this.current_col += 1;
//                        update_move_to_be_made(4);
//                        origin[current_row][current_col] = 4;
//                    }
//                    else if (Validate_direction(1, map)) {
//                        System.out.print("1.2");
//
//                        update_move_to_be_made(1);
//                        this.current_row += 1;
//                        update_move_to_be_made(3);
//                        origin[current_row][current_col] = 3;
//                    }
//                    else if (Validate_direction(3, map)) {
//                        System.out.print("3.2");
//                        update_move_to_be_made(3);
//                        this.current_row -= 1;
//                        update_move_to_be_made(1);
//                        origin[current_row][current_col] = 1;
//                    }
//                    else{
//                        traceback();
//                    }
//                }
//            }
//
//        }
//    }
        }
    }
}