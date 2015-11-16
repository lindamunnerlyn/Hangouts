// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

public class cxy extends cvn
{

    private static final long serialVersionUID = 1L;
    private byte g[][];

    private cxy(ixu ixu1)
    {
        int i = 0;
        super(ixu1.responseHeader, -1L);
        if (cvn.a)
        {
            String s = String.valueOf(ixu1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(s).length() + 31)).append("SetCallerIdConfigResponse from:").append(s).toString());
        }
        g = new byte[ixu1.a.length][];
        ixu1 = ixu1.a;
        int k = ixu1.length;
        int j = 0;
        for (; i < k; i++)
        {
            kop kop1 = ixu1[i];
            g[j] = kop.toByteArray(kop1);
            j++;
        }

    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (ixu)kop.mergeFrom(new ixu(), abyte0);
        if (a(((ixu) (abyte0)).responseHeader))
        {
            ((ajl)hgx.a(g.nS, ajl)).a(1);
            return new cvz(((ixu) (abyte0)).responseHeader);
        } else
        {
            return new cxy(abyte0);
        }
    }

    public void a(aoe aoe1, dfb dfb)
    {
        super.a(aoe1, dfb);
        ebw.e("Babel", "SetCallerIdConfigResponse");
        dfb = new iqq[g.length];
        int i = 0;
        do
        {
            try
            {
                if (i >= g.length)
                {
                    break;
                }
                dfb[i] = (iqq)kop.mergeFrom(new iqq(), g[i]);
            }
            // Misplaced declaration of an exception variable
            catch (aoe aoe1)
            {
                ((ajl)hgx.a(g.nS, ajl)).a(1);
                return;
            }
            i++;
        } while (true);
        for (Iterator iterator = hgx.c(g.nS, dcd).iterator(); iterator.hasNext(); ((dcd)iterator.next()).a(aoe1.f().h(), dfb)) { }
        ((ajl)hgx.a(g.nS, ajl)).a(0);
    }
}
