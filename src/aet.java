// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class aet extends aep
{

    static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "BEGIN", "END", "LOGO", "PHOTO", "LABEL", "FN", "TITLE", "SOUND", "VERSION", "TEL", 
        "EMAIL", "TZ", "GEO", "NOTE", "URL", "BDAY", "ROLE", "REV", "UID", "KEY", 
        "MAILER"
    })));
    static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "DOM", "INTL", "POSTAL", "PARCEL", "HOME", "WORK", "PREF", "VOICE", "FAX", "MSG", 
        "CELL", "PAGER", "BBS", "MODEM", "CAR", "ISDN", "VIDEO", "AOL", "APPLELINK", "ATTMAIL", 
        "CIS", "EWORLD", "INTERNET", "IBMMAIL", "MCIMAIL", "POWERSHARE", "PRODIGY", "TLX", "X400", "GIF", 
        "CGM", "WMF", "BMP", "MET", "PMB", "DIB", "PICT", "TIFF", "PDF", "PS", 
        "JPEG", "QTIME", "MPEG", "MPEG2", "AVI", "WAVE", "AIFF", "PCM", "X509", "PGP"
    })));
    static final Set c = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "INLINE", "URL", "CONTENT-ID", "CID"
    })));
    static final Set d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "7BIT", "8BIT", "QUOTED-PRINTABLE", "BASE64", "B"
    })));
    private final aeq e;

    public aet()
    {
        e = new aeq();
    }

    public aet(byte byte0)
    {
        e = new aeq((byte)0);
    }

    public void a(aeo aeo)
    {
        e.a(aeo);
    }

    public void a(InputStream inputstream)
    {
        e.a(inputstream);
    }

}
