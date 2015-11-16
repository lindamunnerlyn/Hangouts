// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

public final class bhd
{

    boolean a;
    private final Context b;
    private boolean c;
    private PhoneStateListener d;
    private TelephonyManager e;

    public bhd(Context context)
    {
        b = context;
    }

    public void a(bhf bhf1)
    {
        gbh.b(c);
        c = true;
        e = (TelephonyManager)b.getSystemService("phone");
        if (e == null)
        {
            ebw.e("Babel", "couldn't retrieve TelephonyManager!");
            bhf1.a();
            return;
        } else
        {
            d = new bhe(this, bhf1);
            e.listen(d, 1);
            return;
        }
    }

    public boolean a()
    {
        gbh.a(c);
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
