import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    private int[] tmp = new int[256];
    Queue<Character> q = new LinkedList<>();
    public void Insert(char ch)
    {
        if(tmp[ch] == 0){
            q.offer(ch);
            tmp[ch] = 1;
        }else{
            tmp[ch] +=1;
        }
    }
    public char FirstAppearingOnce()
    {
        while(!q.isEmpty()){
            //找到了返回队列第一个，如果队列第一个不是出现了一次，则出队。
            if(tmp[q.peek()]==1){
                return q.peek();//返回头部元素
            }else{
                q.poll();//移除该元素
            }
        }
        return ' ';
    }
}
//原文链接:https://blog.csdn.net/gaozhuang63/article/details/109059317