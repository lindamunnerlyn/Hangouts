// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class cll
    implements ServiceConnection
{

    final DebugActivity a;

    public cll(DebugActivity debugactivity)
    {
        a = debugactivity;
        super();
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        componentname = (clp)ibinder;
        DebugActivity.a(a, componentname.a());
        DebugActivity.d(a).setOnItemClickListener(DebugActivity.f(a));
        DebugActivity.d(a).setOnItemLongClickListener(DebugActivity.g(a));
        DebugActivity.a(a, DebugActivity.h(a));
        DebugActivity.j(a).a(DebugActivity.i(a), null);
        DebugActivity.d(a).setAdapter(DebugActivity.i(a));
        DebugActivity.d(a).setSelection(DebugActivity.i(a).getCount() - 1);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        DebugActivity.j(a).a(null, null);
        DebugActivity.a(a, null);
    }
}
