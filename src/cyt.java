// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

public class cyt extends cxr
{

    private static final long serialVersionUID = 1L;
    private final ArrayList g = new ArrayList();

    private cyt(let let1)
    {
        ler aler[] = let1.a;
        int l = aler.length;
        int i = 0;
        while (i < l) 
        {
            let1 = aler[i];
            String s = ((ler) (let1)).a;
            boolean flag = g.a(((ler) (let1)).b, false);
            boolean flag1 = g.a(((ler) (let1)).c, false);
            boolean flag2 = g.a(((ler) (let1)).d, false);
            int j;
            if (((ler) (let1)).e != null)
            {
                j = g.a(((ler) (let1)).e.b, 0);
            } else
            {
                j = 0;
            }
            if (((ler) (let1)).f != null)
            {
                let1 = ((ler) (let1)).f.a;
            } else
            {
                let1 = null;
            }
            let1 = new dbh(s, flag, flag1, flag2, j, let1);
            g.add(let1);
            i++;
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        if (abyte0 != null)
        {
            abyte0 = (let)kws.mergeFrom(new let(), abyte0);
            if (abyte0 != null)
            {
                return new cyt(abyte0);
            }
        }
        return null;
    }

    public ArrayList k()
    {
        return g;
    }
}
