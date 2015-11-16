// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ata
    implements asr
{

    final asz a;

    ata(asz asz1)
    {
        a = asz1;
        super();
    }

    public void a(boolean flag, amx amx1)
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
        eev.c("Babel_ConvCreator", s);
        if (flag)
        {
            s = String.valueOf(amx1.toString());
            if (s.length() != 0)
            {
                s = "Resolved ".concat(s);
            } else
            {
                s = new String("Resolved ");
            }
            eev.c("Babel_ConvCreator", s);
            a.g = amx1;
        }
        asz.a(a);
    }
}
