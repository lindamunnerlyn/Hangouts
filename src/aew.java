// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class aew extends aer
{

    static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "BEGIN", "END", "LOGO", "PHOTO", "LABEL", "FN", "TITLE", "SOUND", "VERSION", "TEL", 
        "EMAIL", "TZ", "GEO", "NOTE", "URL", "BDAY", "ROLE", "REV", "UID", "KEY", 
        "MAILER", "NAME", "PROFILE", "SOURCE", "NICKNAME", "CLASS", "SORT-STRING", "CATEGORIES", "PRODID", "IMPP"
    })));
    static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "7BIT", "8BIT", "BASE64", "B"
    })));
    private final aeu c;

    public aew()
    {
        c = new aeu();
    }

    public aew(int i)
    {
        c = new aeu((byte)0);
    }

    public void a(aeq aeq)
    {
        c.a(aeq);
    }

    public void a(InputStream inputstream)
    {
        c.a(inputstream);
    }

}
