// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.hangouts.hangout.HangoutActivity;
import com.google.android.apps.hangouts.hangout.HangoutFragment;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.List;

public final class bpd extends boq
{

    final HangoutFragment a;

    public bpd(HangoutFragment hangoutfragment)
    {
        a = hangoutfragment;
        super();
    }

    private void a(ac ac1)
    {
        HangoutFragment.p(a);
        HangoutFragment.a(a, a.a.h());
        ac1.a(a.getFragmentManager(), null);
    }

    public void a(Intent intent)
    {
        if (HangoutFragment.c(a) != 2)
        {
            return;
        } else
        {
            intent.setFlags(intent.getFlags() & 0xefffffff);
            HangoutFragment.p(a);
            a.startActivityForResult(intent, 0);
            return;
        }
    }

    public void a(bpm bpm1)
    {
        int i = HangoutFragment.c(a);
        eev.a("Babel", (new StringBuilder(27)).append("onHangoutEnded: ").append(i).toString());
        if (HangoutFragment.c(a) != 3) goto _L2; else goto _L1
_L1:
        return;
_L2:
        cgg cgg1;
        boolean flag;
        int j;
        j = bpm1.Q();
        if (eev.a("Babel_calls", 3))
        {
            eev.c("Babel_calls", (new StringBuilder(50)).append("HangoutFragment.onHangoutEnded: reason=").append(j).toString());
        }
        cgg1 = (cgg)HangoutFragment.q(a).b(cgg);
        if (cgg1 != null)
        {
label0:
            {
                HangoutFragment.a(a).h();
                if (cgg1.b())
                {
                    flag = true;
                    break label0;
                }
            }
        }
        flag = false;
        if (true) goto _L4; else goto _L3
_L4:
        if (HangoutFragment.a(j))
        {
            break; /* Loop/switch isn't completed */
        }
        HangoutFragment.a(a, 3);
        if (j == 1014)
        {
            if (!(a.getActivity().u_().a("out_of_balance_dialog_fragment_tag") instanceof bre))
            {
                bre.q().a(a.getFragmentManager(), "out_of_balance_dialog_fragment_tag");
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (j == 19)
        {
            a(((ac) (new brd())));
            return;
        }
        HangoutFragment.a(a, bpm1.R(), j);
_L6:
        boi.a(HangoutFragment.b(a), HangoutFragment.r(a));
        return;
_L3:
        if (flag)
        {
            HangoutFragment.a(a, 3);
            HangoutFragment.a(a).h();
            a(cgg1.c());
            return;
        }
        HangoutFragment.b(a).n();
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L1; else goto _L7
_L7:
    }

    public void a(geu geu)
    {
        if (HangoutFragment.c(a) == 2)
        {
            a.a();
        }
    }

    public void a(String s, boolean flag, String s1, boolean flag1)
    {
        if (HangoutFragment.c(a) == 2 && s != null)
        {
            HangoutFragment.b(a).q_();
        }
    }

    public void b(int i)
    {
        HangoutFragment.m(a);
        if ((i & 1) == 0)
        {
            HangoutFragment.a(a, null, false);
        }
    }

    public void b(String s)
    {
        if (HangoutFragment.c(a) == 2)
        {
            HangoutFragment.a(a, a.a.s().e());
        }
    }

    public boolean c(int i)
    {
        return i == 7;
    }

    public void e()
    {
        int i = HangoutFragment.c(a);
        eev.a("Babel", (new StringBuilder(29)).append("onHangoutExiting: ").append(i).toString());
        if (HangoutFragment.c(a) == 3) goto _L2; else goto _L1
_L1:
        cgg cgg1;
        int j;
        j = a.a.s().Q();
        cgg1 = (cgg)HangoutFragment.s(a).b(cgg);
        if (cgg1 == null) goto _L4; else goto _L3
_L3:
        HangoutFragment.a(a).h();
        if (!cgg1.b()) goto _L4; else goto _L5
_L5:
        boolean flag = true;
_L7:
        if (HangoutFragment.a(j) && !flag)
        {
            HangoutFragment.b(a).n();
        }
_L2:
        return;
_L4:
        flag = false;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void f()
    {
        Intent intent = HangoutFragment.b(a).getIntent();
        if (intent.hasExtra("recent_call_timestamp"))
        {
            Object obj = a.a.s();
            gdv.b("Expected non-null", obj);
            List list = ((bpm) (obj)).G();
            if (((bpm) (obj)).L() == 1 && list.size() == 1)
            {
                obj = ((bpm) (obj)).V();
                if (((List) (obj)).size() == 1)
                {
                    obj = ((bpt)((List) (obj)).get(0)).b();
                    RealTimeChatService.a(HangoutFragment.a(a).h(), intent.getLongExtra("recent_call_timestamp", 0L), ((String) (obj)), TextUtils.isEmpty(((CharSequence) (obj))));
                    return;
                }
            }
        }
    }
}
