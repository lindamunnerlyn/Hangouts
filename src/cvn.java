// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cvn extends cvf
{

    private static final long serialVersionUID = 1L;
    private final byte a[];
    private final byte b[];

    public cvn(byte abyte0[], byte abyte1[])
    {
        a = abyte0;
        b = abyte1;
    }

    public kws a(String s, int i, int j)
    {
        jgo jgo1 = new jgo();
        jgo1.requestHeader = cvu.a(s, i, j, h);
        try
        {
            jgo1.a = (jgc)kws.mergeFrom(new jgc(), a);
            jgo1.b = (jif)kws.mergeFrom(new jif(), b);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            eev.e("Babel", "Parse failed", s);
            return null;
        }
        return jgo1;
    }

    public long b()
    {
        return bpm.F();
    }

    public String f()
    {
        return "broadcasts/modify";
    }
}
