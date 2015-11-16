// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class dap extends cxr
{

    private static final long serialVersionUID = 1L;
    private String g[];

    private dap(jfp jfp1)
    {
        super(jfp1.responseHeader, -1L);
        g = new String[jfp1.a.length];
        for (int i = 0; i < g.length; i++)
        {
            g[i] = jfp1.a[i].b;
        }

        if (eev.a("Babel", 3))
        {
            String s = String.valueOf("UndismissSuggestedContactsResponse debugUrl: ");
            jfp1 = String.valueOf(jfp1.responseHeader.c);
            if (jfp1.length() != 0)
            {
                jfp1 = s.concat(jfp1);
            } else
            {
                jfp1 = new String(s);
            }
            eev.d("Babel", jfp1);
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jfp)kws.mergeFrom(new jfp(), abyte0);
        if (a(((jfp) (abyte0)).responseHeader))
        {
            return new cyd(((jfp) (abyte0)).responseHeader);
        } else
        {
            return new dap(abyte0);
        }
    }

    public void a(aow aow1, dgk dgk)
    {
        super.a(aow1, dgk);
        aow1.a();
        int j;
        dgk = g;
        j = dgk.length;
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        aow1.G(dgk[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        aow1.b();
        aow1.c();
        aoc.b(g.nU, aow1.f().h(), "hash_dismissed_contacts");
        RealTimeChatService.a(aow1.f().h(), true);
        return;
        dgk;
        aow1.c();
        throw dgk;
    }
}
