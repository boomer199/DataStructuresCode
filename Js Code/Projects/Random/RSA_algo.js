
/**
 * Returns greatest common denominator of two integers
 * @param {int} a integer
 * @param {int} h integer
 * @returns greatest common denominator.
 */
 function greatestCommonDenominator(a, h){
    let temp = 0
    while(1){
        temp = a % h
        if (temp == 0){
            return h;
        }
        a = h;
        h = temp;
    }
}

function RSA(){
    let p = 3;
    let q = 7;

    // first part of public key
    let n = p * q;

    // other part of public key
    let e = 2; //encrypt
    let pri = (p - 1) * (q - 1)

    while (e < pri){
        if(greatestCommonDenominator(e, pri) == 1){
            break;
        } else {
            e++
        }
    }
    // private key

    let k = 2; // constant
    let d = (1+(k*pri))/e

    let msg = 12;

    console.log("Message data = " + msg)

    // Encryption (c = encryped num)
    let c = Math.pow(msg, e)
    c = c%n
    console.log("Encrypted data = " + c)

    //Decryption (m = decrypted num)
    let m = Math.pow(c, d)
    m = m%n
    console.log("Decryped data = " + m)

}

RSA();