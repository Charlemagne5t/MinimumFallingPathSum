import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class TestSolution {
    @Test
    public void minFallingPathSumTest1(){
        int[][] matrix = {
                {2,1,3},
                {6,5,4},
                {7,8,9}
        };
        Assert.assertEquals(13, new Solution().minFallingPathSum(matrix));
    }
}
