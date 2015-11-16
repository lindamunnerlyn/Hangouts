// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

public class cwp extends cvn
{

    private static final long serialVersionUID = 1L;
    private final ArrayList g = new ArrayList();

    private cwp(kwq kwq1)
    {
        kwo akwo[] = kwq1.a;
        int l = akwo.length;
        int i = 0;
        while (i < l) 
        {
            kwq1 = akwo[i];
            String s = ((kwo) (kwq1)).a;
            boolean flag = g.a(((kwo) (kwq1)).b, false);
            boolean flag1 = g.a(((kwo) (kwq1)).c, false);
            boolean flag2 = g.a(((kwo) (kwq1)).d, false);
            int j;
            if (((kwo) (kwq1)).e != null)
            {
                j = g.a(((kwo) (kwq1)).e.b, 0);
            } else
            {
                j = 0;
            }
            if (((kwo) (kwq1)).f != null)
            {
                kwq1 = ((kwo) (kwq1)).f.a;
            } else
            {
                kwq1 = null;
            }
            kwq1 = new dab(s, flag, flag1, flag2, j, kwq1);
            g.add(kwq1);
            i++;
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        if (abyte0 != null)
        {
            abyte0 = (kwq)kop.mergeFrom(new kwq(), abyte0);
            if (abyte0 != null)
            {
                return new cwp(abyte0);
            }
        }
        return null;
    }

    public ArrayList k()
    {
        return g;
    }
}
