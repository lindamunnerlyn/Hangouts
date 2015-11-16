// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.apps.hangouts.realtimechat.DebugOzGetMergedPersonActivity;

public final class dck
    implements android.view.View.OnClickListener
{

    final TextView a;
    final RadioGroup b;
    final EditText c;
    final CheckBox d;
    final DebugOzGetMergedPersonActivity e;

    public dck(DebugOzGetMergedPersonActivity debugozgetmergedpersonactivity, TextView textview, RadioGroup radiogroup, EditText edittext, CheckBox checkbox)
    {
        e = debugozgetmergedpersonactivity;
        a = textview;
        b = radiogroup;
        c = edittext;
        d = checkbox;
        super();
    }

    public void onClick(View view)
    {
        (new dcl(this, ((gmo)e.getBinder().a(gmo)).a())).execute(new Void[0]);
    }
}
