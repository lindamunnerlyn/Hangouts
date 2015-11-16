// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

public final class bhp
{

    boolean a;
    private final Context b;
    private boolean c;
    private PhoneStateListener d;
    private TelephonyManager e;

    public bhp(Context context)
    {
        b = context;
    }

    public void a(bhr bhr1)
    {
        gdv.b("Expected condition to be false", c);
        c = true;
        e = (TelephonyManager)b.getSystemService("phone");
        if (e == null)
        {
            eev.e("Babel", "couldn't retrieve TelephonyManager!");
            bhr1.a();
            return;
        } else
        {
            d = new bhq(this, bhr1);
            e.listen(d, 1);
            return;
        }
    }

    public boolean a()
    {
        gdv.a("Expected condition to be true", c);
        return a;
    }

    public void b()
    {
        c = false;
        if (d != null)
        {
            e.listen(d, 0);
            d = null;
        }
    }
}
