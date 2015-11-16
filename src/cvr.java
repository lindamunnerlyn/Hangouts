// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public class cvr extends cvn
{

    private static final long serialVersionUID = 1L;
    private final byte g[];
    private final List h;
    private final boolean i;

    private cvr(irp irp1)
    {
        boolean flag1 = false;
        super(irp1.responseHeader, -1L);
        boolean flag;
        if (irp1.b != null)
        {
            g = kop.toByteArray(irp1.b);
        } else
        {
            g = null;
        }
        h = dae.a(irp1.c);
        flag = flag1;
        if (irp1.d != null)
        {
            flag = flag1;
            if (!g.a(irp1.d, false))
            {
                flag = true;
            }
        }
        i = flag;
        if (cvn.a)
        {
            irp1 = String.valueOf(irp1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(irp1).length() + 32)).append("CreateConversationResponse from:").append(irp1).toString());
        }
    }

    private cyw k()
    {
        if (g == null)
        {
            return null;
        }
        cyw cyw1;
        try
        {
            cyw1 = new cyw((irb)kop.mergeFrom(new irb(), g), (byte)0);
        }
        catch (koo koo1)
        {
            return null;
        }
        return cyw1;
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (irp)kop.mergeFrom(new irp(), abyte0);
        if (a(((irp) (abyte0)).responseHeader))
        {
            return new cvz(((irp) (abyte0)).responseHeader);
        } else
        {
            return new cvr(abyte0);
        }
    }

    public void a(aoe aoe1, dfb dfb1)
    {
        cyw cyw1;
        String s;
        super.a(aoe1, dfb1);
        cyw1 = k();
        s = ((ctv)b).j;
        if (ebw.a("Babel", 3))
        {
            String s1 = String.valueOf("processCreateConversationResponse requestClientGeneratedId: ");
            String s2 = cyw1.i;
            String s3 = cyw1.c;
            String s4 = cyw1.toString();
            ebw.d("Babel", (new StringBuilder(String.valueOf(s1).length() + 39 + String.valueOf(s).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length())).append(s1).append(s).append(" clientGeneratedId: ").append(s2).append(" conversationId: ").append(s3).append("; ").append(s4).toString());
        }
        aoe1.a();
        aod aod1;
        int j;
        j = c.b;
        aod1 = new aod();
        if (j != 6)
        {
            break MISSING_BLOCK_LABEL_216;
        }
        long l;
        long l1;
        l = System.currentTimeMillis() * 1000L;
        l1 = cyw1.s;
        if (l1 != 0L)
        {
            l = l1;
        }
        cyw1.a(l);
        any.a(aoe1, cyw1, 0L, s, dfb1, aod1, true);
        s = aod1.a;
        if (h.size() > 0)
        {
            l = 1L + cyw1.s;
            any.a(aoe1, h, s, String.valueOf(l), l, -1L);
        }
        if (i)
        {
            dfb1.a(new cuc(s, true, true, false, null, 0L, null, 0L, null));
        }
        aoe1.b();
        aoe1.c();
        if (s != null)
        {
            any.c(aoe1, s);
            any.d(aoe1, s);
        }
        return;
        dfb1;
        aoe1.c();
        throw dfb1;
    }
}
