// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;

final class eox
    implements end
{

    public final int a;
    public final emy b;
    public final end c;
    final eow d;

    public eox(eow eow1, int i, emy emy1, end end1)
    {
        d = eow1;
        super();
        a = i;
        b = emy1;
        c = end1;
        emy1.a(this);
    }

    public void a()
    {
        b.b(this);
        b.d();
    }

    public void a(ConnectionResult connectionresult)
    {
        eow.e(d).post(new eoy(d, a, connectionresult));
    }

    public void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.append(s).append("GoogleApiClient #").print(a);
        printwriter.println(":");
        b.a((new StringBuilder()).append(s).append("  ").toString(), printwriter);
    }
}
