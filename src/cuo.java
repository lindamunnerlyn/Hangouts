// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Collection;
import java.util.List;

public final class cuo extends cvt
{

    private boolean a;
    private final int b;

    public cuo(aoa aoa1, dfv dfv1)
    {
        super(hio.newBuilder().a(aoa1.a()).b(aoa1.ab()).a(true).a(), dfv1, "lookupmergedperson", dmi.d, new hyk(), new hyl());
        a = true;
        b = aoa1.h();
    }

    public static cuo a(int i, int j, Integer integer, Collection collection)
    {
        g.w();
        integer = new cuo(dcn.e(i), new dfv(j, 0, integer, collection));
        integer.a = false;
        integer.g();
        return integer;
    }

    protected cxr a(kws kws)
    {
        return dfw.a((hyl)kws);
    }

    public void a(int i, Exception exception)
    {
        for (exception = e(); exception == null || !a;)
        {
            return;
        }

        RealTimeChatService.a(b, exception);
    }

    protected void b(kws kws)
    {
        kws = (hyk)kws;
        Object obj = (dfv)super.e;
        kws.a = new icv();
        ((hyk) (kws)).a.a = new hve();
        ((hyk) (kws)).a.a.b = Integer.valueOf(((dfv) (obj)).a());
        ((hyk) (kws)).a.a.c = Integer.valueOf(((dfv) (obj)).b());
        ((hyk) (kws)).a.a.g = ((dfv) (obj)).c();
        obj = ((dfv) (obj)).d();
        ((hyk) (kws)).a.a.a = (String)((List) (obj)).get(0);
        String as[] = new String[((List) (obj)).size()];
        ((List) (obj)).toArray(as);
        ((hyk) (kws)).a.a.e = as;
    }
}
