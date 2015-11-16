// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.EditText;
import com.google.android.apps.hangouts.realtimechat.DebugOzGetMergedPersonActivity;

public final class dcj
    implements android.view.View.OnClickListener
{

    final EditText a;
    final DebugOzGetMergedPersonActivity b;

    public dcj(DebugOzGetMergedPersonActivity debugozgetmergedpersonactivity, EditText edittext)
    {
        b = debugozgetmergedpersonactivity;
        a = edittext;
        super();
    }

    public void onClick(View view)
    {
        a.setInputType(33);
    }
}
