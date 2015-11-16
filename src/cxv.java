// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public class cxv extends cxr
{

    private static final long serialVersionUID = 1L;
    private final byte g[];
    private final List h;
    private final boolean i;

    private cxv(ixu ixu1)
    {
        boolean flag1 = false;
        super(ixu1.responseHeader, -1L);
        boolean flag;
        if (ixu1.b != null)
        {
            g = kws.toByteArray(ixu1.b);
        } else
        {
            g = null;
        }
        h = dbk.a(ixu1.c);
        flag = flag1;
        if (ixu1.d != null)
        {
            flag = flag1;
            if (!g.a(ixu1.d, false))
            {
                flag = true;
            }
        }
        i = flag;
        if (cxr.a)
        {
            ixu1 = String.valueOf(ixu1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(ixu1).length() + 32)).append("CreateConversationResponse from:").append(ixu1).toString());
        }
    }

    private dnc k()
    {
        if (g == null)
        {
            return null;
        }
        dnc dnc1;
        try
        {
            dnc1 = new dnc((ixg)kws.mergeFrom(new ixg(), g), (byte)0);
        }
        catch (kwr kwr1)
        {
            return null;
        }
        return dnc1;
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (ixu)kws.mergeFrom(new ixu(), abyte0);
        if (a(((ixu) (abyte0)).responseHeader))
        {
            return new cyd(((ixu) (abyte0)).responseHeader);
        } else
        {
            return new cxv(abyte0);
        }
    }

    public void a(aow aow1, dgk dgk1)
    {
        dnc dnc1;
        String s;
        super.a(aow1, dgk1);
        dnc1 = k();
        s = ((cvz)b).j;
        if (eev.a("Babel", 3))
        {
            String s1 = String.valueOf("processCreateConversationResponse requestClientGeneratedId: ");
            String s2 = dnc1.i;
            String s3 = dnc1.c;
            String s4 = String.valueOf(dnc1.toString());
            eev.d("Babel", (new StringBuilder(String.valueOf(s1).length() + 39 + String.valueOf(s).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length())).append(s1).append(s).append(" clientGeneratedId: ").append(s2).append(" conversationId: ").append(s3).append("; ").append(s4).toString());
        }
        aow1.a();
        aov aov1;
        int j;
        j = c.b;
        aov1 = new aov();
        if (j != 6)
        {
            break MISSING_BLOCK_LABEL_219;
        }
        long l;
        long l1;
        l = System.currentTimeMillis() * 1000L;
        l1 = dnc1.s;
        if (l1 != 0L)
        {
            l = l1;
        }
        dnc1.a(l);
        aoq.a(aow1, dnc1, 0L, s, dgk1, aov1, true);
        s = aov1.a;
        if (h.size() > 0)
        {
            l = 1L + dnc1.s;
            aoq.a(aow1, h, s, String.valueOf(l), l, -1L);
        }
        if (i)
        {
            dgk1.a(new cwg(s, true, true, false, null, 0L, null, 0L, null));
        }
        aow1.b();
        aow1.c();
        if (s != null)
        {
            aoq.c(aow1, s);
            aoq.d(aow1, s);
        }
        return;
        dgk1;
        aow1.c();
        throw dgk1;
    }
}
