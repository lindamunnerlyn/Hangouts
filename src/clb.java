// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.Toast;
import com.google.android.apps.hangouts.phone.DebugActivity;
import java.util.Arrays;

public final class clb
    implements android.view.View.OnClickListener
{

    final String a[];
    final DebugActivity b;

    public clb(DebugActivity debugactivity, String as[])
    {
        b = debugactivity;
        a = as;
        super();
    }

    public void onClick(View view)
    {
        Toast.makeText(b, Arrays.toString(a), 1).show();
    }
}
