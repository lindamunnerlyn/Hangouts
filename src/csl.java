// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Collection;
import java.util.List;

public final class csl extends ctp
{

    private boolean a;
    private final int b;

    public csl(ani ani1, dem dem1)
    {
        super(hdx.newBuilder().a(ani1.a()).b(ani1.ae()).a().b(), dem1, "lookupmergedperson", "plusi", new htg(), new hth());
        a = true;
        b = ani1.h();
    }

    public static csl a(int i, int j, Integer integer, Collection collection)
    {
        g.x();
        integer = new csl(dbf.e(i), new dem(j, 0, integer, collection));
        integer.a = false;
        integer.g();
        return integer;
    }

    protected cvn a(kop kop)
    {
        return den.a((hth)kop);
    }

    public void a(int i, Exception exception)
    {
        for (exception = e(); exception == null || !a;)
        {
            return;
        }

        RealTimeChatService.a(b, exception);
    }

    protected void b(kop kop)
    {
        kop = (htg)kop;
        Object obj = (dem)super.e;
        kop.a = new hxr();
        ((htg) (kop)).a.a = new hqh();
        ((htg) (kop)).a.a.b = Integer.valueOf(((dem) (obj)).a());
        ((htg) (kop)).a.a.c = Integer.valueOf(((dem) (obj)).b());
        ((htg) (kop)).a.a.g = ((dem) (obj)).c();
        obj = ((dem) (obj)).d();
        ((htg) (kop)).a.a.a = (String)((List) (obj)).get(0);
        String as[] = new String[((List) (obj)).size()];
        ((List) (obj)).toArray(as);
        ((htg) (kop)).a.a.e = as;
    }
}
