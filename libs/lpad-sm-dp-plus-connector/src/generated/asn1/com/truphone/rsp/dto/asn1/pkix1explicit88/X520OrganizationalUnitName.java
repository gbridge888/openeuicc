/*
 * This class file was automatically generated by ASN1bean v1.13.0 (http://www.beanit.com)
 */

package com.truphone.rsp.dto.asn1.pkix1explicit88;

import java.io.IOException;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.io.Serializable;
import com.beanit.asn1bean.ber.*;
import com.beanit.asn1bean.ber.types.*;
import com.beanit.asn1bean.ber.types.string.*;


public class X520OrganizationalUnitName implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	private byte[] code = null;
	private BerTeletexString teletexString = null;
	private BerPrintableString printableString = null;
	private BerUniversalString universalString = null;
	private BerUTF8String utf8String = null;
	private BerBMPString bmpString = null;
	
	public X520OrganizationalUnitName() {
	}

	public X520OrganizationalUnitName(byte[] code) {
		this.code = code;
	}

	public void setTeletexString(BerTeletexString teletexString) {
		this.teletexString = teletexString;
	}

	public BerTeletexString getTeletexString() {
		return teletexString;
	}

	public void setPrintableString(BerPrintableString printableString) {
		this.printableString = printableString;
	}

	public BerPrintableString getPrintableString() {
		return printableString;
	}

	public void setUniversalString(BerUniversalString universalString) {
		this.universalString = universalString;
	}

	public BerUniversalString getUniversalString() {
		return universalString;
	}

	public void setUtf8String(BerUTF8String utf8String) {
		this.utf8String = utf8String;
	}

	public BerUTF8String getUtf8String() {
		return utf8String;
	}

	public void setBmpString(BerBMPString bmpString) {
		this.bmpString = bmpString;
	}

	public BerBMPString getBmpString() {
		return bmpString;
	}

	@Override public int encode(OutputStream reverseOS) throws IOException {

		if (code != null) {
			reverseOS.write(code);
			return code.length;
		}

		int codeLength = 0;
		if (bmpString != null) {
			codeLength += bmpString.encode(reverseOS, true);
			return codeLength;
		}
		
		if (utf8String != null) {
			codeLength += utf8String.encode(reverseOS, true);
			return codeLength;
		}
		
		if (universalString != null) {
			codeLength += universalString.encode(reverseOS, true);
			return codeLength;
		}
		
		if (printableString != null) {
			codeLength += printableString.encode(reverseOS, true);
			return codeLength;
		}
		
		if (teletexString != null) {
			codeLength += teletexString.encode(reverseOS, true);
			return codeLength;
		}
		
		throw new IOException("Error encoding CHOICE: No element of CHOICE was selected.");
	}

	@Override public int decode(InputStream is) throws IOException {
		return decode(is, null);
	}

	public int decode(InputStream is, BerTag berTag) throws IOException {

		int tlvByteCount = 0;
		boolean tagWasPassed = (berTag != null);

		if (berTag == null) {
			berTag = new BerTag();
			tlvByteCount += berTag.decode(is);
		}

		if (berTag.equals(BerTeletexString.tag)) {
			teletexString = new BerTeletexString();
			tlvByteCount += teletexString.decode(is, false);
			return tlvByteCount;
		}

		if (berTag.equals(BerPrintableString.tag)) {
			printableString = new BerPrintableString();
			tlvByteCount += printableString.decode(is, false);
			return tlvByteCount;
		}

		if (berTag.equals(BerUniversalString.tag)) {
			universalString = new BerUniversalString();
			tlvByteCount += universalString.decode(is, false);
			return tlvByteCount;
		}

		if (berTag.equals(BerUTF8String.tag)) {
			utf8String = new BerUTF8String();
			tlvByteCount += utf8String.decode(is, false);
			return tlvByteCount;
		}

		if (berTag.equals(BerBMPString.tag)) {
			bmpString = new BerBMPString();
			tlvByteCount += bmpString.decode(is, false);
			return tlvByteCount;
		}

		if (tagWasPassed) {
			return 0;
		}

		throw new IOException("Error decoding CHOICE: Tag " + berTag + " matched to no item.");
	}

	public void encodeAndSave(int encodingSizeGuess) throws IOException {
		ReverseByteArrayOutputStream reverseOS = new ReverseByteArrayOutputStream(encodingSizeGuess);
		encode(reverseOS);
		code = reverseOS.getArray();
	}

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		appendAsString(sb, 0);
		return sb.toString();
	}

	public void appendAsString(StringBuilder sb, int indentLevel) {

		if (teletexString != null) {
			sb.append("teletexString: ").append(teletexString);
			return;
		}

		if (printableString != null) {
			sb.append("printableString: ").append(printableString);
			return;
		}

		if (universalString != null) {
			sb.append("universalString: ").append(universalString);
			return;
		}

		if (utf8String != null) {
			sb.append("utf8String: ").append(utf8String);
			return;
		}

		if (bmpString != null) {
			sb.append("bmpString: ").append(bmpString);
			return;
		}

		sb.append("<none>");
	}

}

