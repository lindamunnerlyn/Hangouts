// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cvu extends cvn
{

    private static final long serialVersionUID = 1L;
    private final long g;
    private final String h[];

    public cvu(irz irz1)
    {
        super(irz1.responseHeader, 0L);
        if (cvn.a)
        {
            String s = String.valueOf(irz1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(s).length() + 32)).append("DeleteConversationResponse from:").append(s).toString());
        }
        String as[] = null;
        long l;
        if (irz1.a != null)
        {
            if (g.a(irz1.a.a, 0) == 2)
            {
                as = irz1.a.d;
            }
            if (irz1.a.c != null)
            {
                l = g.a(irz1.a.c, 0L);
                irz1 = as;
            } else
            {
                irz1 = as;
                l = -1L;
            }
        } else
        {
            irz1 = null;
            l = -1L;
        }
        g = l;
        h = irz1;
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (irz)kop.mergeFrom(new irz(), abyte0);
        if (a(((irz) (abyte0)).responseHeader))
        {
            return new cvz(((irz) (abyte0)).responseHeader);
        } else
        {
            return new cvu(abyte0);
        }
    }

    public void a(aoe aoe1, dfb dfb)
    {
        super.a(aoe1, dfb);
        aoe1.a();
        (new dco(((ctx)b).c, g, h)).a(aoe1);
        aoe1.b();
        aoe1.c();
        return;
        dfb;
        aoe1.c();
        throw dfb;
    }
}
