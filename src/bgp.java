// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.apps.hangouts.fragments.CallContactPickerFragment;

public final class bgp
    implements TextWatcher
{

    final CallContactPickerFragment a;

    public bgp(CallContactPickerFragment callcontactpickerfragment)
    {
        a = callcontactpickerfragment;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
        g.a(editable);
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
label0:
        {
            CallContactPickerFragment.b(a).a(charsequence);
            if (charsequence.length() == 0)
            {
                if (CallContactPickerFragment.c(a) != 0)
                {
                    break label0;
                }
                CallContactPickerFragment.a(a, 0);
            }
            return;
        }
        CallContactPickerFragment.a(a, 2);
    }
}
