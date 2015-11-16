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

public interface fvf
    extends IInterface
{

    public abstract void a(fuz fuz);

    public abstract void a(fuz fuz, byte byte0);

    public abstract void a(fuz fuz, int i1);

    public abstract void a(fuz fuz, Uri uri);

    public abstract void a(fuz fuz, Uri uri, int i1);

    public abstract void a(fuz fuz, Asset asset);

    public abstract void a(fuz fuz, ConnectionConfiguration connectionconfiguration);

    public abstract void a(fuz fuz, PutDataRequest putdatarequest);

    public abstract void a(fuz fuz, AddListenerRequest addlistenerrequest);

    public abstract void a(fuz fuz, AncsNotificationParcelable ancsnotificationparcelable);

    public abstract void a(fuz fuz, RemoveListenerRequest removelistenerrequest);

    public abstract void a(fuz fuz, fuw fuw, String s);

    public abstract void a(fuz fuz, String s);

    public abstract void a(fuz fuz, String s, int i1);

    public abstract void a(fuz fuz, String s, ParcelFileDescriptor parcelfiledescriptor);

    public abstract void a(fuz fuz, String s, ParcelFileDescriptor parcelfiledescriptor, long l1, long l2);

    public abstract void a(fuz fuz, String s, String s1);

    public abstract void a(fuz fuz, String s, String s1, byte abyte0[]);

    public abstract void a(fuz fuz, boolean flag);

    public abstract void b(fuz fuz);

    public abstract void b(fuz fuz, int i1);

    public abstract void b(fuz fuz, Uri uri);

    public abstract void b(fuz fuz, Uri uri, int i1);

    public abstract void b(fuz fuz, ConnectionConfiguration connectionconfiguration);

    public abstract void b(fuz fuz, fuw fuw, String s);

    public abstract void b(fuz fuz, String s);

    public abstract void b(fuz fuz, String s, int i1);

    public abstract void b(fuz fuz, boolean flag);

    public abstract void c(fuz fuz);

    public abstract void c(fuz fuz, int i1);

    public abstract void c(fuz fuz, Uri uri);

    public abstract void c(fuz fuz, String s);

    public abstract void d(fuz fuz);

    public abstract void d(fuz fuz, String s);

    public abstract void e(fuz fuz);

    public abstract void e(fuz fuz, String s);

    public abstract void f(fuz fuz);

    public abstract void f(fuz fuz, String s);

    public abstract void g(fuz fuz);

    public abstract void h(fuz fuz);

    public abstract void i(fuz fuz);

    public abstract void j(fuz fuz);

    public abstract void k(fuz fuz);

    public abstract void l(fuz fuz);

    public abstract void m(fuz fuz);

    public abstract void n(fuz fuz);

    public abstract void o(fuz fuz);

    public abstract void p(fuz fuz);
}
