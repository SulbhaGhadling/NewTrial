package SerialTest;

import java.io.Serializable;

public class FlatInfo implements Serializable {

	transient int flatNo;
	transient char wing;
	transient String ownerNm;

	public FlatInfo(int flatNo, char wing, String ownerNm) {

		this.flatNo = flatNo;
		this.wing = wing;
		this.ownerNm = ownerNm;
	}

}
