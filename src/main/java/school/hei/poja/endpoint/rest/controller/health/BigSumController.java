import java.math.BigInteger;

@RestController
public class BigSumController {

    @GetMapping("/big-sum")
    public BigInteger calculateSum(@RequestParam("a") String a, @RequestParam("b") String b) {
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
        
        return numA.add(numB);
    }
}