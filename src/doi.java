// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;
import java.util.Locale;

public final class doi
{

    public static final Comparator a = new doj();
    public final String b;
    public final String c;
    public final String d;

    public doi(String s, String s1)
    {
        b = s;
        c = s1;
        d = (new Locale("", s)).getDisplayCountry();
    }

}
