// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cxy extends cxr
{

    private static final long serialVersionUID = 1L;
    private final long g;
    private final String h[];

    public cxy(iye iye1)
    {
        super(iye1.responseHeader, 0L);
        if (cxr.a)
        {
            String s = String.valueOf(iye1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(s).length() + 32)).append("DeleteConversationResponse from:").append(s).toString());
        }
        String as[] = null;
        long l;
        if (iye1.a != null)
        {
            if (g.a(iye1.a.a, 0) == 2)
            {
                as = iye1.a.d;
            }
            if (iye1.a.c != null)
            {
                l = g.a(iye1.a.c, 0L);
                iye1 = as;
            } else
            {
                iye1 = as;
                l = -1L;
            }
        } else
        {
            iye1 = null;
            l = -1L;
        }
        g = l;
        h = iye1;
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (iye)kws.mergeFrom(new iye(), abyte0);
        if (a(((iye) (abyte0)).responseHeader))
        {
            return new cyd(((iye) (abyte0)).responseHeader);
        } else
        {
            return new cxy(abyte0);
        }
    }

    public void a(aow aow1, dgk dgk)
    {
        super.a(aow1, dgk);
        aow1.a();
        (new ddw(((cwb)b).c, g, h)).a(aow1);
        aow1.b();
        aow1.c();
        return;
        dgk;
        aow1.c();
        throw dgk;
    }
}
