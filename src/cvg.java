// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cvg extends cvf
{

    private static final long serialVersionUID = 1L;
    private final byte a[];

    public cvg(byte abyte0[])
    {
        a = abyte0;
    }

    public kws a(String s, int i, int j)
    {
        jgm jgm1 = new jgm();
        jgm1.requestHeader = cvu.a(s, i, j, h);
        try
        {
            jgm1.a = (jgc)kws.mergeFrom(new jgc(), a);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            eev.e("Babel", "Parse failed", s);
            return null;
        }
        return jgm1;
    }

    public long b()
    {
        return bpm.F();
    }

    public String f()
    {
        return "broadcasts/add";
    }
}
