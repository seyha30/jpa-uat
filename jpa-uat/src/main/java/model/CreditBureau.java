package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CREDIT_BUREAU database table.
 * 
 */
@Entity
@Table(name="CREDIT_BUREAU")
@NamedQuery(name="CreditBureau.findAll", query="SELECT c FROM CreditBureau c")
public class CreditBureau implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal a1;

	private String a10;

	private String a100;

	private String a101;

	private String a102;

	private String a103;

	private String a104;

	private String a105;

	private String a106;

	private String a107;

	private String a108;

	private String a109;

	private Object a11;

	private String a110;

	private String a111;

	private String a112;

	private String a113;

	private String a114;

	private String a115;

	private String a116;

	private String a117;

	private String a118;

	private String a119;

	private String a12;

	private String a120;

	private String a121;

	private String a122;

	private String a123;

	private String a124;

	private String a125;

	private String a126;

	private String a127;

	private String a128;

	private String a129;

	private String a13;

	private String a130;

	private String a131;

	private String a132;

	private String a133;

	private String a134;

	private String a135;

	private String a136;

	private String a137;

	private String a138;

	private String a139;

	private String a14;

	private String a140;

	private String a141;

	private String a142;

	private String a143;

	private String a144;

	private String a145;

	private String a146;

	private String a147;

	private String a148;

	private String a149;

	private String a15;

	private String a150;

	private String a151;

	private String a152;

	private String a153;

	private String a154;

	private String a155;

	private String a156;

	private String a157;

	private String a158;

	private String a159;

	private String a16;

	private Object a160;

	private String a161;

	private String a162;

	private String a163;

	private Object a164;

	private String a165;

	private String a166;

	private String a167;

	private String a168;

	private String a169;

	private String a17;

	private Object a170;

	private String a171;

	private String a172;

	private String a173;

	private String a174;

	private Object a175;

	private String a176;

	private Object a177;

	private String a178;

	private String a179;

	private String a18;

	private String a180;

	private String a181;

	private String a19;

	private String a2;

	private String a20;

	private String a21;

	private String a22;

	private String a23;

	private String a24;

	private String a25;

	private String a26;

	private String a27;

	private String a28;

	private String a29;

	private String a3;

	private String a30;

	private String a31;

	private String a32;

	private String a33;

	private String a34;

	private String a35;

	private String a36;

	private String a37;

	private String a38;

	private String a39;

	private Object a4;

	private String a40;

	private String a41;

	private String a42;

	private String a43;

	private String a44;

	private String a45;

	private String a46;

	private String a47;

	private String a48;

	private String a49;

	private String a5;

	private String a50;

	private String a51;

	private String a52;

	private String a53;

	private String a54;

	private String a55;

	private String a56;

	private String a57;

	private String a58;

	private String a59;

	private String a6;

	private String a60;

	private String a61;

	private String a62;

	private String a63;

	private String a64;

	private String a65;

	private String a66;

	private String a67;

	private String a68;

	private String a69;

	private String a7;

	private String a70;

	private String a71;

	private String a72;

	private String a73;

	private String a74;

	private String a75;

	private String a76;

	private String a77;

	private String a78;

	private String a79;

	private String a8;

	private String a80;

	private String a81;

	private String a82;

	private String a83;

	private String a84;

	private String a85;

	private String a86;

	private String a87;

	private String a88;

	private String a89;

	private String a9;

	private String a90;

	private String a91;

	private String a92;

	private String a93;

	private String a94;

	private String a95;

	private String a96;

	private String a97;

	private String a98;

	private String a99;

	@Column(name="USER_ID")
	private String userId;

	public CreditBureau() {
	}

	public BigDecimal getA1() {
		return this.a1;
	}

	public void setA1(BigDecimal a1) {
		this.a1 = a1;
	}

	public String getA10() {
		return this.a10;
	}

	public void setA10(String a10) {
		this.a10 = a10;
	}

	public String getA100() {
		return this.a100;
	}

	public void setA100(String a100) {
		this.a100 = a100;
	}

	public String getA101() {
		return this.a101;
	}

	public void setA101(String a101) {
		this.a101 = a101;
	}

	public String getA102() {
		return this.a102;
	}

	public void setA102(String a102) {
		this.a102 = a102;
	}

	public String getA103() {
		return this.a103;
	}

	public void setA103(String a103) {
		this.a103 = a103;
	}

	public String getA104() {
		return this.a104;
	}

	public void setA104(String a104) {
		this.a104 = a104;
	}

	public String getA105() {
		return this.a105;
	}

	public void setA105(String a105) {
		this.a105 = a105;
	}

	public String getA106() {
		return this.a106;
	}

	public void setA106(String a106) {
		this.a106 = a106;
	}

	public String getA107() {
		return this.a107;
	}

	public void setA107(String a107) {
		this.a107 = a107;
	}

	public String getA108() {
		return this.a108;
	}

	public void setA108(String a108) {
		this.a108 = a108;
	}

	public String getA109() {
		return this.a109;
	}

	public void setA109(String a109) {
		this.a109 = a109;
	}

	public Object getA11() {
		return this.a11;
	}

	public void setA11(Object a11) {
		this.a11 = a11;
	}

	public String getA110() {
		return this.a110;
	}

	public void setA110(String a110) {
		this.a110 = a110;
	}

	public String getA111() {
		return this.a111;
	}

	public void setA111(String a111) {
		this.a111 = a111;
	}

	public String getA112() {
		return this.a112;
	}

	public void setA112(String a112) {
		this.a112 = a112;
	}

	public String getA113() {
		return this.a113;
	}

	public void setA113(String a113) {
		this.a113 = a113;
	}

	public String getA114() {
		return this.a114;
	}

	public void setA114(String a114) {
		this.a114 = a114;
	}

	public String getA115() {
		return this.a115;
	}

	public void setA115(String a115) {
		this.a115 = a115;
	}

	public String getA116() {
		return this.a116;
	}

	public void setA116(String a116) {
		this.a116 = a116;
	}

	public String getA117() {
		return this.a117;
	}

	public void setA117(String a117) {
		this.a117 = a117;
	}

	public String getA118() {
		return this.a118;
	}

	public void setA118(String a118) {
		this.a118 = a118;
	}

	public String getA119() {
		return this.a119;
	}

	public void setA119(String a119) {
		this.a119 = a119;
	}

	public String getA12() {
		return this.a12;
	}

	public void setA12(String a12) {
		this.a12 = a12;
	}

	public String getA120() {
		return this.a120;
	}

	public void setA120(String a120) {
		this.a120 = a120;
	}

	public String getA121() {
		return this.a121;
	}

	public void setA121(String a121) {
		this.a121 = a121;
	}

	public String getA122() {
		return this.a122;
	}

	public void setA122(String a122) {
		this.a122 = a122;
	}

	public String getA123() {
		return this.a123;
	}

	public void setA123(String a123) {
		this.a123 = a123;
	}

	public String getA124() {
		return this.a124;
	}

	public void setA124(String a124) {
		this.a124 = a124;
	}

	public String getA125() {
		return this.a125;
	}

	public void setA125(String a125) {
		this.a125 = a125;
	}

	public String getA126() {
		return this.a126;
	}

	public void setA126(String a126) {
		this.a126 = a126;
	}

	public String getA127() {
		return this.a127;
	}

	public void setA127(String a127) {
		this.a127 = a127;
	}

	public String getA128() {
		return this.a128;
	}

	public void setA128(String a128) {
		this.a128 = a128;
	}

	public String getA129() {
		return this.a129;
	}

	public void setA129(String a129) {
		this.a129 = a129;
	}

	public String getA13() {
		return this.a13;
	}

	public void setA13(String a13) {
		this.a13 = a13;
	}

	public String getA130() {
		return this.a130;
	}

	public void setA130(String a130) {
		this.a130 = a130;
	}

	public String getA131() {
		return this.a131;
	}

	public void setA131(String a131) {
		this.a131 = a131;
	}

	public String getA132() {
		return this.a132;
	}

	public void setA132(String a132) {
		this.a132 = a132;
	}

	public String getA133() {
		return this.a133;
	}

	public void setA133(String a133) {
		this.a133 = a133;
	}

	public String getA134() {
		return this.a134;
	}

	public void setA134(String a134) {
		this.a134 = a134;
	}

	public String getA135() {
		return this.a135;
	}

	public void setA135(String a135) {
		this.a135 = a135;
	}

	public String getA136() {
		return this.a136;
	}

	public void setA136(String a136) {
		this.a136 = a136;
	}

	public String getA137() {
		return this.a137;
	}

	public void setA137(String a137) {
		this.a137 = a137;
	}

	public String getA138() {
		return this.a138;
	}

	public void setA138(String a138) {
		this.a138 = a138;
	}

	public String getA139() {
		return this.a139;
	}

	public void setA139(String a139) {
		this.a139 = a139;
	}

	public String getA14() {
		return this.a14;
	}

	public void setA14(String a14) {
		this.a14 = a14;
	}

	public String getA140() {
		return this.a140;
	}

	public void setA140(String a140) {
		this.a140 = a140;
	}

	public String getA141() {
		return this.a141;
	}

	public void setA141(String a141) {
		this.a141 = a141;
	}

	public String getA142() {
		return this.a142;
	}

	public void setA142(String a142) {
		this.a142 = a142;
	}

	public String getA143() {
		return this.a143;
	}

	public void setA143(String a143) {
		this.a143 = a143;
	}

	public String getA144() {
		return this.a144;
	}

	public void setA144(String a144) {
		this.a144 = a144;
	}

	public String getA145() {
		return this.a145;
	}

	public void setA145(String a145) {
		this.a145 = a145;
	}

	public String getA146() {
		return this.a146;
	}

	public void setA146(String a146) {
		this.a146 = a146;
	}

	public String getA147() {
		return this.a147;
	}

	public void setA147(String a147) {
		this.a147 = a147;
	}

	public String getA148() {
		return this.a148;
	}

	public void setA148(String a148) {
		this.a148 = a148;
	}

	public String getA149() {
		return this.a149;
	}

	public void setA149(String a149) {
		this.a149 = a149;
	}

	public String getA15() {
		return this.a15;
	}

	public void setA15(String a15) {
		this.a15 = a15;
	}

	public String getA150() {
		return this.a150;
	}

	public void setA150(String a150) {
		this.a150 = a150;
	}

	public String getA151() {
		return this.a151;
	}

	public void setA151(String a151) {
		this.a151 = a151;
	}

	public String getA152() {
		return this.a152;
	}

	public void setA152(String a152) {
		this.a152 = a152;
	}

	public String getA153() {
		return this.a153;
	}

	public void setA153(String a153) {
		this.a153 = a153;
	}

	public String getA154() {
		return this.a154;
	}

	public void setA154(String a154) {
		this.a154 = a154;
	}

	public String getA155() {
		return this.a155;
	}

	public void setA155(String a155) {
		this.a155 = a155;
	}

	public String getA156() {
		return this.a156;
	}

	public void setA156(String a156) {
		this.a156 = a156;
	}

	public String getA157() {
		return this.a157;
	}

	public void setA157(String a157) {
		this.a157 = a157;
	}

	public String getA158() {
		return this.a158;
	}

	public void setA158(String a158) {
		this.a158 = a158;
	}

	public String getA159() {
		return this.a159;
	}

	public void setA159(String a159) {
		this.a159 = a159;
	}

	public String getA16() {
		return this.a16;
	}

	public void setA16(String a16) {
		this.a16 = a16;
	}

	public Object getA160() {
		return this.a160;
	}

	public void setA160(Object a160) {
		this.a160 = a160;
	}

	public String getA161() {
		return this.a161;
	}

	public void setA161(String a161) {
		this.a161 = a161;
	}

	public String getA162() {
		return this.a162;
	}

	public void setA162(String a162) {
		this.a162 = a162;
	}

	public String getA163() {
		return this.a163;
	}

	public void setA163(String a163) {
		this.a163 = a163;
	}

	public Object getA164() {
		return this.a164;
	}

	public void setA164(Object a164) {
		this.a164 = a164;
	}

	public String getA165() {
		return this.a165;
	}

	public void setA165(String a165) {
		this.a165 = a165;
	}

	public String getA166() {
		return this.a166;
	}

	public void setA166(String a166) {
		this.a166 = a166;
	}

	public String getA167() {
		return this.a167;
	}

	public void setA167(String a167) {
		this.a167 = a167;
	}

	public String getA168() {
		return this.a168;
	}

	public void setA168(String a168) {
		this.a168 = a168;
	}

	public String getA169() {
		return this.a169;
	}

	public void setA169(String a169) {
		this.a169 = a169;
	}

	public String getA17() {
		return this.a17;
	}

	public void setA17(String a17) {
		this.a17 = a17;
	}

	public Object getA170() {
		return this.a170;
	}

	public void setA170(Object a170) {
		this.a170 = a170;
	}

	public String getA171() {
		return this.a171;
	}

	public void setA171(String a171) {
		this.a171 = a171;
	}

	public String getA172() {
		return this.a172;
	}

	public void setA172(String a172) {
		this.a172 = a172;
	}

	public String getA173() {
		return this.a173;
	}

	public void setA173(String a173) {
		this.a173 = a173;
	}

	public String getA174() {
		return this.a174;
	}

	public void setA174(String a174) {
		this.a174 = a174;
	}

	public Object getA175() {
		return this.a175;
	}

	public void setA175(Object a175) {
		this.a175 = a175;
	}

	public String getA176() {
		return this.a176;
	}

	public void setA176(String a176) {
		this.a176 = a176;
	}

	public Object getA177() {
		return this.a177;
	}

	public void setA177(Object a177) {
		this.a177 = a177;
	}

	public String getA178() {
		return this.a178;
	}

	public void setA178(String a178) {
		this.a178 = a178;
	}

	public String getA179() {
		return this.a179;
	}

	public void setA179(String a179) {
		this.a179 = a179;
	}

	public String getA18() {
		return this.a18;
	}

	public void setA18(String a18) {
		this.a18 = a18;
	}

	public String getA180() {
		return this.a180;
	}

	public void setA180(String a180) {
		this.a180 = a180;
	}

	public String getA181() {
		return this.a181;
	}

	public void setA181(String a181) {
		this.a181 = a181;
	}

	public String getA19() {
		return this.a19;
	}

	public void setA19(String a19) {
		this.a19 = a19;
	}

	public String getA2() {
		return this.a2;
	}

	public void setA2(String a2) {
		this.a2 = a2;
	}

	public String getA20() {
		return this.a20;
	}

	public void setA20(String a20) {
		this.a20 = a20;
	}

	public String getA21() {
		return this.a21;
	}

	public void setA21(String a21) {
		this.a21 = a21;
	}

	public String getA22() {
		return this.a22;
	}

	public void setA22(String a22) {
		this.a22 = a22;
	}

	public String getA23() {
		return this.a23;
	}

	public void setA23(String a23) {
		this.a23 = a23;
	}

	public String getA24() {
		return this.a24;
	}

	public void setA24(String a24) {
		this.a24 = a24;
	}

	public String getA25() {
		return this.a25;
	}

	public void setA25(String a25) {
		this.a25 = a25;
	}

	public String getA26() {
		return this.a26;
	}

	public void setA26(String a26) {
		this.a26 = a26;
	}

	public String getA27() {
		return this.a27;
	}

	public void setA27(String a27) {
		this.a27 = a27;
	}

	public String getA28() {
		return this.a28;
	}

	public void setA28(String a28) {
		this.a28 = a28;
	}

	public String getA29() {
		return this.a29;
	}

	public void setA29(String a29) {
		this.a29 = a29;
	}

	public String getA3() {
		return this.a3;
	}

	public void setA3(String a3) {
		this.a3 = a3;
	}

	public String getA30() {
		return this.a30;
	}

	public void setA30(String a30) {
		this.a30 = a30;
	}

	public String getA31() {
		return this.a31;
	}

	public void setA31(String a31) {
		this.a31 = a31;
	}

	public String getA32() {
		return this.a32;
	}

	public void setA32(String a32) {
		this.a32 = a32;
	}

	public String getA33() {
		return this.a33;
	}

	public void setA33(String a33) {
		this.a33 = a33;
	}

	public String getA34() {
		return this.a34;
	}

	public void setA34(String a34) {
		this.a34 = a34;
	}

	public String getA35() {
		return this.a35;
	}

	public void setA35(String a35) {
		this.a35 = a35;
	}

	public String getA36() {
		return this.a36;
	}

	public void setA36(String a36) {
		this.a36 = a36;
	}

	public String getA37() {
		return this.a37;
	}

	public void setA37(String a37) {
		this.a37 = a37;
	}

	public String getA38() {
		return this.a38;
	}

	public void setA38(String a38) {
		this.a38 = a38;
	}

	public String getA39() {
		return this.a39;
	}

	public void setA39(String a39) {
		this.a39 = a39;
	}

	public Object getA4() {
		return this.a4;
	}

	public void setA4(Object a4) {
		this.a4 = a4;
	}

	public String getA40() {
		return this.a40;
	}

	public void setA40(String a40) {
		this.a40 = a40;
	}

	public String getA41() {
		return this.a41;
	}

	public void setA41(String a41) {
		this.a41 = a41;
	}

	public String getA42() {
		return this.a42;
	}

	public void setA42(String a42) {
		this.a42 = a42;
	}

	public String getA43() {
		return this.a43;
	}

	public void setA43(String a43) {
		this.a43 = a43;
	}

	public String getA44() {
		return this.a44;
	}

	public void setA44(String a44) {
		this.a44 = a44;
	}

	public String getA45() {
		return this.a45;
	}

	public void setA45(String a45) {
		this.a45 = a45;
	}

	public String getA46() {
		return this.a46;
	}

	public void setA46(String a46) {
		this.a46 = a46;
	}

	public String getA47() {
		return this.a47;
	}

	public void setA47(String a47) {
		this.a47 = a47;
	}

	public String getA48() {
		return this.a48;
	}

	public void setA48(String a48) {
		this.a48 = a48;
	}

	public String getA49() {
		return this.a49;
	}

	public void setA49(String a49) {
		this.a49 = a49;
	}

	public String getA5() {
		return this.a5;
	}

	public void setA5(String a5) {
		this.a5 = a5;
	}

	public String getA50() {
		return this.a50;
	}

	public void setA50(String a50) {
		this.a50 = a50;
	}

	public String getA51() {
		return this.a51;
	}

	public void setA51(String a51) {
		this.a51 = a51;
	}

	public String getA52() {
		return this.a52;
	}

	public void setA52(String a52) {
		this.a52 = a52;
	}

	public String getA53() {
		return this.a53;
	}

	public void setA53(String a53) {
		this.a53 = a53;
	}

	public String getA54() {
		return this.a54;
	}

	public void setA54(String a54) {
		this.a54 = a54;
	}

	public String getA55() {
		return this.a55;
	}

	public void setA55(String a55) {
		this.a55 = a55;
	}

	public String getA56() {
		return this.a56;
	}

	public void setA56(String a56) {
		this.a56 = a56;
	}

	public String getA57() {
		return this.a57;
	}

	public void setA57(String a57) {
		this.a57 = a57;
	}

	public String getA58() {
		return this.a58;
	}

	public void setA58(String a58) {
		this.a58 = a58;
	}

	public String getA59() {
		return this.a59;
	}

	public void setA59(String a59) {
		this.a59 = a59;
	}

	public String getA6() {
		return this.a6;
	}

	public void setA6(String a6) {
		this.a6 = a6;
	}

	public String getA60() {
		return this.a60;
	}

	public void setA60(String a60) {
		this.a60 = a60;
	}

	public String getA61() {
		return this.a61;
	}

	public void setA61(String a61) {
		this.a61 = a61;
	}

	public String getA62() {
		return this.a62;
	}

	public void setA62(String a62) {
		this.a62 = a62;
	}

	public String getA63() {
		return this.a63;
	}

	public void setA63(String a63) {
		this.a63 = a63;
	}

	public String getA64() {
		return this.a64;
	}

	public void setA64(String a64) {
		this.a64 = a64;
	}

	public String getA65() {
		return this.a65;
	}

	public void setA65(String a65) {
		this.a65 = a65;
	}

	public String getA66() {
		return this.a66;
	}

	public void setA66(String a66) {
		this.a66 = a66;
	}

	public String getA67() {
		return this.a67;
	}

	public void setA67(String a67) {
		this.a67 = a67;
	}

	public String getA68() {
		return this.a68;
	}

	public void setA68(String a68) {
		this.a68 = a68;
	}

	public String getA69() {
		return this.a69;
	}

	public void setA69(String a69) {
		this.a69 = a69;
	}

	public String getA7() {
		return this.a7;
	}

	public void setA7(String a7) {
		this.a7 = a7;
	}

	public String getA70() {
		return this.a70;
	}

	public void setA70(String a70) {
		this.a70 = a70;
	}

	public String getA71() {
		return this.a71;
	}

	public void setA71(String a71) {
		this.a71 = a71;
	}

	public String getA72() {
		return this.a72;
	}

	public void setA72(String a72) {
		this.a72 = a72;
	}

	public String getA73() {
		return this.a73;
	}

	public void setA73(String a73) {
		this.a73 = a73;
	}

	public String getA74() {
		return this.a74;
	}

	public void setA74(String a74) {
		this.a74 = a74;
	}

	public String getA75() {
		return this.a75;
	}

	public void setA75(String a75) {
		this.a75 = a75;
	}

	public String getA76() {
		return this.a76;
	}

	public void setA76(String a76) {
		this.a76 = a76;
	}

	public String getA77() {
		return this.a77;
	}

	public void setA77(String a77) {
		this.a77 = a77;
	}

	public String getA78() {
		return this.a78;
	}

	public void setA78(String a78) {
		this.a78 = a78;
	}

	public String getA79() {
		return this.a79;
	}

	public void setA79(String a79) {
		this.a79 = a79;
	}

	public String getA8() {
		return this.a8;
	}

	public void setA8(String a8) {
		this.a8 = a8;
	}

	public String getA80() {
		return this.a80;
	}

	public void setA80(String a80) {
		this.a80 = a80;
	}

	public String getA81() {
		return this.a81;
	}

	public void setA81(String a81) {
		this.a81 = a81;
	}

	public String getA82() {
		return this.a82;
	}

	public void setA82(String a82) {
		this.a82 = a82;
	}

	public String getA83() {
		return this.a83;
	}

	public void setA83(String a83) {
		this.a83 = a83;
	}

	public String getA84() {
		return this.a84;
	}

	public void setA84(String a84) {
		this.a84 = a84;
	}

	public String getA85() {
		return this.a85;
	}

	public void setA85(String a85) {
		this.a85 = a85;
	}

	public String getA86() {
		return this.a86;
	}

	public void setA86(String a86) {
		this.a86 = a86;
	}

	public String getA87() {
		return this.a87;
	}

	public void setA87(String a87) {
		this.a87 = a87;
	}

	public String getA88() {
		return this.a88;
	}

	public void setA88(String a88) {
		this.a88 = a88;
	}

	public String getA89() {
		return this.a89;
	}

	public void setA89(String a89) {
		this.a89 = a89;
	}

	public String getA9() {
		return this.a9;
	}

	public void setA9(String a9) {
		this.a9 = a9;
	}

	public String getA90() {
		return this.a90;
	}

	public void setA90(String a90) {
		this.a90 = a90;
	}

	public String getA91() {
		return this.a91;
	}

	public void setA91(String a91) {
		this.a91 = a91;
	}

	public String getA92() {
		return this.a92;
	}

	public void setA92(String a92) {
		this.a92 = a92;
	}

	public String getA93() {
		return this.a93;
	}

	public void setA93(String a93) {
		this.a93 = a93;
	}

	public String getA94() {
		return this.a94;
	}

	public void setA94(String a94) {
		this.a94 = a94;
	}

	public String getA95() {
		return this.a95;
	}

	public void setA95(String a95) {
		this.a95 = a95;
	}

	public String getA96() {
		return this.a96;
	}

	public void setA96(String a96) {
		this.a96 = a96;
	}

	public String getA97() {
		return this.a97;
	}

	public void setA97(String a97) {
		this.a97 = a97;
	}

	public String getA98() {
		return this.a98;
	}

	public void setA98(String a98) {
		this.a98 = a98;
	}

	public String getA99() {
		return this.a99;
	}

	public void setA99(String a99) {
		this.a99 = a99;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}