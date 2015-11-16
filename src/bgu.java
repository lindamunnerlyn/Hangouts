// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.fragments.CallContactPickerFragment;

public final class bgu
    implements android.view.View.OnLongClickListener
{

    final CallContactPickerFragment a;

    public bgu(CallContactPickerFragment callcontactpickerfragment)
    {
        a = callcontactpickerfragment;
        super();
    }

    public boolean onLongClick(View view)
    {
        CallContactPickerFragment.g(a).b();
        return true;
    }
}
