import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int asteroid : asteroids){
            boolean flag = true;
            while(!stack.isEmpty() && asteroid<0 && stack.peek()>0){
                if(-asteroid>stack.peek()){
                    stack.pop();
                }else if(-asteroid<stack.peek()){
                    flag = false;
                    break;
                }else{
                    flag = false;
                    stack.pop();
                    break;
                }
            }
            if(flag){
                stack.push(asteroid);
            }
        }
        int[] arr = new int[stack.size()];
        for(int i = arr.length-1 ;i>=0 ;i--){
            arr[i] = stack.pop();
        }
        return arr;
    }
}
