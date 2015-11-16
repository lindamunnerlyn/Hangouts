// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

public class dac extends cxr
{

    private static final long serialVersionUID = 1L;
    private byte g[][];

    private dac(jdz jdz1)
    {
        int i = 0;
        super(jdz1.responseHeader, -1L);
        if (cxr.a)
        {
            String s = String.valueOf(jdz1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(s).length() + 31)).append("SetCallerIdConfigResponse from:").append(s).toString());
        }
        g = new byte[jdz1.a.length][];
        jdz1 = jdz1.a;
        int k = jdz1.length;
        int j = 0;
        for (; i < k; i++)
        {
            kws kws1 = jdz1[i];
            g[j] = kws.toByteArray(kws1);
            j++;
        }

    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jdz)kws.mergeFrom(new jdz(), abyte0);
        if (a(((jdz) (abyte0)).responseHeader))
        {
            ((aji)hlp.a(g.nU, aji)).a(1);
            return new cyd(((jdz) (abyte0)).responseHeader);
        } else
        {
            return new dac(abyte0);
        }
    }

    public void a(aow aow1, dgk dgk)
    {
        super.a(aow1, dgk);
        eev.e("Babel", "SetCallerIdConfigResponse");
        dgk = new iwv[g.length];
        int i = 0;
        do
        {
            try
            {
                if (i >= g.length)
                {
                    break;
                }
                dgk[i] = (iwv)kws.mergeFrom(new iwv(), g[i]);
            }
            // Misplaced declaration of an exception variable
            catch (aow aow1)
            {
                ((aji)hlp.a(g.nU, aji)).a(1);
                return;
            }
            i++;
        } while (true);
        for (Iterator iterator = hlp.c(g.nU, ddl).iterator(); iterator.hasNext(); ((ddl)iterator.next()).a(aow1.f().h(), dgk)) { }
        ((aji)hlp.a(g.nU, aji)).a(0);
    }
}
