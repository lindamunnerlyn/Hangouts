// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import com.google.android.apps.hangouts.fragments.HiddenContactsFragment;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class bkg
    implements eev
{

    final HiddenContactsFragment a;

    public bkg(HiddenContactsFragment hiddencontactsfragment)
    {
        a = hiddencontactsfragment;
        super();
    }

    public void a(eeu eeu1)
    {
        String s = eeu1.b();
        eeu1 = eeu1.a().a;
        if (!g.a(HiddenContactsFragment.a(a), eeu1))
        {
            HiddenContactsFragment.b(a);
            int i = RealTimeChatService.a(HiddenContactsFragment.c(a).a(), eeu1);
            HiddenContactsFragment.d(a).append(i, s);
            HiddenContactsFragment.a(a).append(i, eeu1);
        }
        HiddenContactsFragment.e(a).notifyDataSetChanged();
    }
}
