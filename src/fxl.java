// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.internal.AddListenerRequest;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.RemoveListenerRequest;

public interface fxl
    extends IInterface
{

    public abstract void a(fxf fxf);

    public abstract void a(fxf fxf, byte byte0);

    public abstract void a(fxf fxf, int i1);

    public abstract void a(fxf fxf, Uri uri);

    public abstract void a(fxf fxf, Uri uri, int i1);

    public abstract void a(fxf fxf, Asset asset);

    public abstract void a(fxf fxf, ConnectionConfiguration connectionconfiguration);

    public abstract void a(fxf fxf, PutDataRequest putdatarequest);

    public abstract void a(fxf fxf, AddListenerRequest addlistenerrequest);

    public abstract void a(fxf fxf, AncsNotificationParcelable ancsnotificationparcelable);

    public abstract void a(fxf fxf, RemoveListenerRequest removelistenerrequest);

    public abstract void a(fxf fxf, fxc fxc, String s);

    public abstract void a(fxf fxf, String s);

    public abstract void a(fxf fxf, String s, int i1);

    public abstract void a(fxf fxf, String s, ParcelFileDescriptor parcelfiledescriptor);

    public abstract void a(fxf fxf, String s, ParcelFileDescriptor parcelfiledescriptor, long l1, long l2);

    public abstract void a(fxf fxf, String s, String s1);

    public abstract void a(fxf fxf, String s, String s1, byte abyte0[]);

    public abstract void a(fxf fxf, boolean flag);

    public abstract void b(fxf fxf);

    public abstract void b(fxf fxf, int i1);

    public abstract void b(fxf fxf, Uri uri);

    public abstract void b(fxf fxf, Uri uri, int i1);

    public abstract void b(fxf fxf, ConnectionConfiguration connectionconfiguration);

    public abstract void b(fxf fxf, fxc fxc, String s);

    public abstract void b(fxf fxf, String s);

    public abstract void b(fxf fxf, String s, int i1);

    public abstract void b(fxf fxf, boolean flag);

    public abstract void c(fxf fxf);

    public abstract void c(fxf fxf, int i1);

    public abstract void c(fxf fxf, Uri uri);

    public abstract void c(fxf fxf, String s);

    public abstract void d(fxf fxf);

    public abstract void d(fxf fxf, String s);

    public abstract void e(fxf fxf);

    public abstract void e(fxf fxf, String s);

    public abstract void f(fxf fxf);

    public abstract void f(fxf fxf, String s);

    public abstract void g(fxf fxf);

    public abstract void h(fxf fxf);

    public abstract void i(fxf fxf);

    public abstract void j(fxf fxf);

    public abstract void k(fxf fxf);

    public abstract void l(fxf fxf);

    public abstract void m(fxf fxf);

    public abstract void n(fxf fxf);

    public abstract void o(fxf fxf);

    public abstract void p(fxf fxf);
}
