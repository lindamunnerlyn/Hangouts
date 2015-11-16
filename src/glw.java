// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class glw
{

    final gls a = new gls(100);

    public glw()
    {
    }

    public boolean a(String s, glo glo1)
    {
        return a.a(glo1.b()).matcher(s).matches();
    }

    public boolean a(String s, glo glo1, boolean flag)
    {
        s = a.a(glo1.a()).matcher(s);
        return s.matches() || flag && s.lookingAt();
    }
}
