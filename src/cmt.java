// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class cmt
    implements ServiceConnection
{

    final DebugActivity a;

    public cmt(DebugActivity debugactivity)
    {
        a = debugactivity;
        super();
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        componentname = (cmx)ibinder;
        DebugActivity.a(a, componentname.a());
        DebugActivity.d(a).setOnItemClickListener(DebugActivity.e(a));
        DebugActivity.d(a).setOnItemLongClickListener(DebugActivity.f(a));
        DebugActivity.a(a, DebugActivity.g(a));
        DebugActivity.i(a).a(DebugActivity.h(a), null);
        DebugActivity.d(a).setAdapter(DebugActivity.h(a));
        DebugActivity.d(a).setSelection(DebugActivity.h(a).getCount() - 1);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        DebugActivity.i(a).a(null, null);
        DebugActivity.a(a, null);
    }
}
