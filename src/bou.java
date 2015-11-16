// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.hangouts.hangout.HangoutActivity;
import com.google.android.apps.hangouts.hangout.HangoutFragment;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.List;

public final class bou extends boh
{

    final HangoutFragment a;

    public bou(HangoutFragment hangoutfragment)
    {
        a = hangoutfragment;
        super();
    }

    private void a(ac ac1)
    {
        HangoutFragment.p(a);
        HangoutFragment.a(a, a.a.i());
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

    public void a(bpd bpd1)
    {
        if (HangoutFragment.c(a) != 3) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        i = bpd1.R();
        if (ebw.a("Babel_calls", 3))
        {
            ebw.c("Babel_calls", (new StringBuilder(50)).append("HangoutFragment.onHangoutEnded: reason=").append(i).toString());
        }
        if (!HangoutFragment.a(i)) goto _L4; else goto _L3
_L3:
        HangoutFragment.b(a).n();
_L5:
        bnz.a(HangoutFragment.b(a), HangoutFragment.s(a));
        return;
_L4:
label0:
        {
            HangoutFragment.a(a, 3);
            if (i != 1014)
            {
                break label0;
            }
            if (!(a.getActivity().t_().a("out_of_balance_dialog_fragment_tag") instanceof bqv))
            {
                bqv.q().a(a.getFragmentManager(), "out_of_balance_dialog_fragment_tag");
                return;
            }
        }
          goto _L1
        if (i == 19)
        {
            a(((ac) (new bqu())));
            return;
        }
        if (i == 26)
        {
            a(((ac) (new bmx())));
            return;
        }
        HangoutFragment.a(a, bpd1.S(), i);
          goto _L5
    }

    public void a(gcg gcg)
    {
        if (HangoutFragment.c(a) == 2)
        {
            a.a();
        }
    }

    public void a(String s)
    {
        if (HangoutFragment.c(a) == 2)
        {
            ((gmo)HangoutFragment.q(a).a(gmo)).a();
            if ((cfb)HangoutFragment.r(a).b(cfb) != null)
            {
                a.getFragmentManager();
                return;
            }
        }
    }

    public void a(String s, boolean flag, String s1, boolean flag1, boolean flag2)
    {
        if (HangoutFragment.c(a) == 2 && s != null)
        {
            HangoutFragment.b(a).p_();
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
            HangoutFragment.a(a, a.a.t().e());
        }
    }

    public boolean c(int i)
    {
        return i == 7;
    }

    public void e()
    {
        if (HangoutFragment.c(a) != 3 && HangoutFragment.a(a.a.t().R()))
        {
            HangoutFragment.b(a).n();
        }
    }

    public void f()
    {
        Intent intent = HangoutFragment.b(a).getIntent();
        if (intent.hasExtra("recent_call_timestamp"))
        {
            Object obj = a.a.t();
            gbh.b(obj);
            List list = ((bpd) (obj)).H();
            if (((bpd) (obj)).M() == 1 && list.size() == 1)
            {
                obj = ((bpd) (obj)).W();
                if (((List) (obj)).size() == 1)
                {
                    obj = ((bpk)((List) (obj)).get(0)).b();
                    RealTimeChatService.a(HangoutFragment.a(a).h(), intent.getLongExtra("recent_call_timestamp", 0L), ((String) (obj)), TextUtils.isEmpty(((CharSequence) (obj))));
                    return;
                }
            }
        }
    }
}
