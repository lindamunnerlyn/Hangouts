// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.hangouts.fragments.CallContactPickerFragment;

public final class bgz
    implements android.view.ActionMode.Callback
{

    final CallContactPickerFragment a;

    public bgz(CallContactPickerFragment callcontactpickerfragment)
    {
        a = callcontactpickerfragment;
        super();
    }

    public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
    {
        return false;
    }

    public boolean onCreateActionMode(ActionMode actionmode, Menu menu)
    {
        CallContactPickerFragment.a(a).o_();
        return true;
    }

    public void onDestroyActionMode(ActionMode actionmode)
    {
        CallContactPickerFragment.a(a).p_();
    }

    public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
    {
        return false;
    }
}
