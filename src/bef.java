// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

public final class bef extends guy
{

    public final dgk a = new dgk();
    private final Context b;
    private final aoa c;
    private final String d;
    private final String g;
    private final ato h;
    private final int i = 0;
    private final String j;
    private final boolean k;
    private final String l;
    private final long m;
    private final dcw n;

    public bef(Context context, aoa aoa1, String s, String s1, ato ato1, int i1, String s2, 
            boolean flag, String s3, long l1)
    {
        super(context, "SendChatMessageTask");
        b = context;
        c = aoa1;
        d = s;
        g = s1;
        h = ato1;
        j = s2;
        k = flag;
        l = s3;
        m = l1;
        n = dcn.g(aoa1);
    }

    private long a(aow aow1, long l1, boolean flag, int i1, String s, String s1, 
            String s2)
    {
        List list;
        ArrayList arraylist;
        list = g.a(s2, 0);
        arraylist = new ArrayList();
        if (h == null) goto _L2; else goto _L1
_L1:
        Object obj = a(h);
        if (h.c != atp.e) goto _L4; else goto _L3
_L3:
        Object obj1 = ((beh) (obj)).g;
        bzi bzi1 = (bzi)hlp.a(b, bzi);
        s2 = ((fik) (obj1)).c().toString();
        double d1 = ((fik) (obj1)).d().a;
        double d2 = ((fik) (obj1)).d().b;
        String s3 = ((fik) (obj1)).b().toString();
        obj = bzi1.a(((fik) (obj1)));
        obj1 = bzi1.b(((fik) (obj1)));
        arraylist.add(new dmr(new int[] {
            0
        }, s2, d1, d2, s3, ((String) (obj)), ((String) (obj1))));
_L2:
        s = new dkp(s1, c.b(), l1, l, list, null, arraylist, flag, dsu.b, 0, i1, s, null, 0L, 0, 0L, null, 6, null, 0, 1000L * m);
        s.a(aow1, a);
        return s.a();
_L4:
        if (((beh) (obj)).c != null || ((beh) (obj)).a != null)
        {
            String s4 = ((beh) (obj)).f;
            s2 = s4;
            if (s4 == null)
            {
                s4 = b.getContentResolver().getType(Uri.parse(((beh) (obj)).a));
                s2 = s4;
                if (s4 == null)
                {
                    s2 = "image/jpg";
                }
            }
            s4 = ((beh) (obj)).c;
            String s5 = ((beh) (obj)).a;
            int j1 = ((beh) (obj)).d;
            int k1 = ((beh) (obj)).e;
            int i2 = ((beh) (obj)).b;
            arraylist.add(new dms(new int[] {
                0
            }, s4, s5, j1, k1, s2, i2));
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    private beh a(ato ato1)
    {
        int k1 = 0;
        if (ato1 == null) goto _L2; else goto _L1
_L1:
        beg.a[ato1.c.ordinal()];
        JVM INSTR tableswitch 1 3: default 44
    //                   1 79
    //                   2 106
    //                   3 147;
           goto _L2 _L3 _L4 _L5
_L2:
        Object obj;
        String s;
        fik fik1;
        int i1;
        int j1;
        fik1 = null;
        s = null;
        j1 = 0;
        obj = null;
        i1 = 0;
        ato1 = null;
_L7:
        return new beh(this, ato1, i1, ((String) (obj)), j1, k1, s, fik1);
_L3:
        ato1 = (atv)ato1;
        s = "hangouts/location";
        fik1 = ((atv) (ato1)).e;
        j1 = 0;
        obj = null;
        i1 = 0;
        ato1 = null;
        continue; /* Loop/switch isn't completed */
_L4:
        obj = (atx)ato1;
        s = ((atx) (obj)).d;
        ato1 = ato1.a;
        j1 = ((atx) (obj)).f;
        k1 = ((atx) (obj)).e;
        i1 = ((atx) (obj)).g;
        fik1 = null;
        obj = null;
        continue; /* Loop/switch isn't completed */
_L5:
        obj = (aua)ato1;
        s = ((aua) (obj)).d;
        ato1 = ato1.a;
        obj = ((aua) (obj)).e;
        fik1 = null;
        j1 = 0;
        i1 = 0;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void a(aow aow1, boolean flag, int i1, String s, aoz aoz1, String s1, String s2)
    {
        if (aow.a(s1) || aoz1.i != 0) goto _L2; else goto _L1
_L1:
        if (!aow1.aa(s1)) goto _L4; else goto _L3
_L3:
        aoq.a(aow1.f(), s1, 5);
        n.a(new cwg(new cvz(l, 1, null, aoq.a(aow1.f(), s1)), s1), dir.b().a());
        eev.a("Babel", "Checking the server to see if we can move this conversation fromthe contingency state");
_L6:
        return;
_L4:
        long l1 = aow1.k(s1);
        aoz1 = new ArrayList();
        if (h != null && h.c == atp.d && aow1.ai(((aua)h).e) != null)
        {
            aoz1.add(g.a(b, "babel_stickers_account_id", "108618507921641169817"));
        }
        s2 = g.i(s2);
        ArrayList arraylist = new ArrayList();
        if (h != null)
        {
            arraylist.add(h);
        }
        n.a((new dji(l, s1)).a(aow1.V(s1)).a(l1).a(flag).b().b(s).a(i1).c().a(s2).b(arraylist).c(aoz1).a(), dir.b().a());
        return;
_L2:
        if (aoz1.i == 2 || aoz1.k == 1)
        {
            if (aoz1.i == 2)
            {
                eev.b("Babel", "Retry invitation accept reply since it permenantly failed");
            } else
            {
                eev.b("Babel", "Send invitation accept reply since it is invited");
            }
            n.a(new cwu(s1), dir.b().a());
            return;
        }
        if (aoz1.i == 4)
        {
            RealTimeChatService.i(c, s1);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private boolean a(aow aow1, int i1, String s)
    {
        String s2;
        cab cab1;
        int j1;
        j1 = c.h();
        cab1 = (new cab()).b(l).a(d);
        aow1.a();
        h.a(j1, SystemClock.elapsedRealtime(), 10, cab1.a(101));
        s2 = d;
        aoz aoz3 = aow1.f(s2);
        Object obj;
        aoz aoz1;
        String s1;
        aoz aoz2;
        aoz2 = aoz3;
        s1 = s2;
        if (aoz3 != null)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        aoz1 = aoz3;
        obj = s2;
        if (!aow.a(s2))
        {
            break MISSING_BLOCK_LABEL_128;
        }
        s1 = RealTimeChatService.a(s2);
        aoz1 = aoz3;
        obj = s2;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        aoz1 = aow1.f(s1);
        obj = s1;
        aoz2 = aoz1;
        s1 = ((String) (obj));
        if (aoz1 != null)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        s = String.valueOf(obj);
        if (s.length() == 0)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        s = "Failed to find conversation: ".concat(s);
_L1:
        eev.f("Babel", s);
        aow1.b();
        aow1.c();
        return false;
        s = new String("Failed to find conversation: ");
          goto _L1
        s;
        aow1.c();
        throw s;
        long l1 = aow.a(aoz2.q, 1);
        i;
        JVM INSTR tableswitch 1 2: default 578
    //                   1 360
    //                   2 366;
           goto _L2 _L3 _L4
_L2:
        boolean flag;
        if (aoz2.l == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = h;
        if (obj == null) goto _L6; else goto _L5
_L5:
        if (((ato) (obj)).c == atp.e) goto _L7; else goto _L6
_L6:
        obj = g;
_L10:
        if (!dcz.x(c.h())) goto _L9; else goto _L8
_L8:
        a(aow1, flag, i1, s, aoz2, s1, ((String) (obj)));
        s = Long.valueOf(a(aow1, l1, flag, i1, s, s1, ((String) (obj))));
_L11:
        aow1.b();
        aow1.c();
        h.a(j1, SystemClock.elapsedRealtime(), 10, cab1.a(102));
        aoq.d(aow1, s1);
        Object obj1;
        String s3;
        return s != null;
_L3:
        flag = true;
        break MISSING_BLOCK_LABEL_248;
_L4:
        flag = false;
        break MISSING_BLOCK_LABEL_248;
_L7:
        obj1 = a(((ato) (obj))).g;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_526;
        }
        if (!g.e(i1))
        {
            break MISSING_BLOCK_LABEL_526;
        }
        obj = new StringBuilder(g);
        s3 = ((bzi)hlp.a(b, bzi)).b(((fik) (obj1)));
        if (((StringBuilder) (obj)).length() > 0)
        {
            ((StringBuilder) (obj)).append("\n");
        }
        ((StringBuilder) (obj)).append(s3);
        ((StringBuilder) (obj)).append("\n");
        ((StringBuilder) (obj)).append(((fik) (obj1)).c());
        obj1 = ((fik) (obj1)).b();
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            ((StringBuilder) (obj)).append("\n");
            ((StringBuilder) (obj)).append(((CharSequence) (obj1)));
        }
        obj = ((StringBuilder) (obj)).toString();
          goto _L10
        obj = g;
          goto _L10
_L9:
        l1 = a(aow1, l1, flag, i1, s, s1, ((String) (obj)));
        a(aow1, flag, i1, s, aoz2, s1, ((String) (obj)));
        s = Long.valueOf(l1);
          goto _L11
    }

    protected gvv a()
    {
        aow aow1;
        int i1;
        i1 = c.h();
        cab cab1 = (new cab()).b(l).a(d);
        h.a(i1, m, 11, cab1.a(0));
        h.a(i1, SystemClock.elapsedRealtime(), 10, cab1.a(201));
        aow1 = new aow(b, i1);
        i1 = aow1.g(d);
        if (!g.d(aow1.g(d))) goto _L2; else goto _L1
_L1:
        beh beh1 = a(h);
        ((dml)hlp.a(b, dml)).a(c, d, g, beh1.a, beh1.b, beh1.c, beh1.d, beh1.e, beh1.f, j, k, beh1.g, i);
_L4:
        return new gvv(200, null, l);
_L2:
        String s;
        switch (i1)
        {
        default:
            s = null;
            break;

        case 2: // '\002'
            break; /* Loop/switch isn't completed */
        }
_L5:
        a(aow1, i1, s);
        if (true) goto _L4; else goto _L3
_L3:
        s = c.A();
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }
}
