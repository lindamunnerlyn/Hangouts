// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.Calendar;

public final class cyv
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    public String a;
    public String b;
    public int c;
    public Calendar d;
    public Calendar e;

    public cyv()
    {
    }

    public static Calendar a(iag iag1)
    {
        if (iag1 == null)
        {
            return Calendar.getInstance();
        } else
        {
            Calendar calendar = Calendar.getInstance();
            calendar.set(g.a(iag1.c, 0), g.a(iag1.b, 0), g.a(iag1.a, 0));
            return calendar;
        }
    }
}
