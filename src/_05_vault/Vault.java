package _05_vault;

public class Vault {
	int code = 666;

//It also contains a tryCode() method that takes a number as a parameter
//and returns true if that number opens the vault,
//false otherwise.
	boolean tryCode(int CodeToTry) {

		// return CodeToTry == code;

		if (CodeToTry == code) {
			return true;
		} else
			return false;
	}
}
//