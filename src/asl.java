// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class asl
    implements asc
{

    final ask a;

    asl(ask ask1)
    {
        a = ask1;
        super();
    }

    public void a(boolean flag, amf amf1)
    {
        String s;
        if (flag)
        {
            s = "successfully";
        } else
        {
            s = "unsuccessfully";
        }
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "Gaia resolution completed ".concat(s);
        } else
        {
            s = new String("Gaia resolution completed ");
        }
        ebw.c("Babel_ConvCreator", s);
        if (flag)
        {
            s = String.valueOf(amf1.toString());
            if (s.length() != 0)
            {
                s = "Resolved ".concat(s);
            } else
            {
                s = new String("Resolved ");
            }
            ebw.c("Babel_ConvCreator", s);
            a.g = amf1;
        }
        ask.a(a);
    }
}
