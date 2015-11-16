// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.hangouts.fragments.BlockedPeopleFragment;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class bft
    implements edj
{

    final BlockedPeopleFragment a;

    public bft(BlockedPeopleFragment blockedpeoplefragment)
    {
        a = blockedpeoplefragment;
        super();
    }

    public void a(edi edi1)
    {
        String s;
        cey cey1;
label0:
        {
            BlockedPeopleFragment.a(a);
            s = edi1.b();
            if (s == null)
            {
                edi1 = a.getActivity();
                ebr.a(edi1, edi1.getResources().getString(l.jx, new Object[] {
                    ""
                }));
                return;
            }
            cey1 = edi1.a();
            ani ani1 = dbf.l();
            if (BlockedPeopleFragment.b(a).q())
            {
                edi1 = ani1;
                if (ani1 != null)
                {
                    break label0;
                }
            }
            edi1 = BlockedPeopleFragment.b(a);
        }
        int i = RealTimeChatService.a(edi1, cey1.a, cey1.b, s, false, false);
        BlockedPeopleFragment.c(a).put(Integer.valueOf(i), new bfx(cey1, s));
        BlockedPeopleFragment.d(a).notifyDataSetChanged();
    }
}
