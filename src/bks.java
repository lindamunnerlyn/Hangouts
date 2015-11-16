// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import com.google.android.apps.hangouts.fragments.HiddenContactsFragment;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class bks
    implements ehx
{

    final HiddenContactsFragment a;

    public bks(HiddenContactsFragment hiddencontactsfragment)
    {
        a = hiddencontactsfragment;
        super();
    }

    public void a(ehw ehw1)
    {
        String s = ehw1.b();
        ehw1 = ehw1.a().a;
        if (!g.a(HiddenContactsFragment.a(a), ehw1))
        {
            HiddenContactsFragment.b(a);
            int i = RealTimeChatService.a(HiddenContactsFragment.c(a).a(), ehw1);
            HiddenContactsFragment.d(a).append(i, s);
            HiddenContactsFragment.a(a).append(i, ehw1);
        }
        HiddenContactsFragment.e(a).notifyDataSetChanged();
    }
}
