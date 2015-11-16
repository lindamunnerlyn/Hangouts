// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Toast;
import com.google.android.apps.hangouts.fragments.BlockedPeopleFragment;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class bgf
    implements egl
{

    final BlockedPeopleFragment a;

    public bgf(BlockedPeopleFragment blockedpeoplefragment)
    {
        a = blockedpeoplefragment;
        super();
    }

    public void a(egk egk1)
    {
        String s;
        cgd cgd1;
label0:
        {
            BlockedPeopleFragment.a(a);
            s = egk1.b();
            if (s == null)
            {
                Toast.makeText(BlockedPeopleFragment.b(a), l.iO, 0).show();
                return;
            }
            cgd1 = egk1.a();
            aoa aoa1 = dcn.l();
            if (BlockedPeopleFragment.c(a).o())
            {
                egk1 = aoa1;
                if (aoa1 != null)
                {
                    break label0;
                }
            }
            egk1 = BlockedPeopleFragment.c(a);
        }
        int i = RealTimeChatService.a(egk1, cgd1.a, cgd1.b, s, false, false);
        BlockedPeopleFragment.d(a).put(Integer.valueOf(i), new bgj(cgd1, s));
        BlockedPeopleFragment.e(a).notifyDataSetChanged();
    }
}
