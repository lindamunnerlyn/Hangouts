// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.internal.AddListenerRequest;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.RemoveListenerRequest;

final class fvh
    implements fvf
{

    private IBinder a;

    fvh(IBinder ibinder)
    {
        a = ibinder;
    }

    public void a(fuz fuz1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        a.transact(22, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }

    public void a(fuz fuz1, byte byte0)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        parcel.writeByte(byte0);
        a.transact(53, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }

    public void a(fuz fuz1, int i1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        parcel.writeInt(i1);
        a.transact(43, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }

    public void a(fuz fuz1, Uri uri)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null) goto _L2; else goto _L1
_L1:
        fuz1 = fuz1.asBinder();
_L5:
        parcel.writeStrongBinder(fuz1);
        if (uri == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L6:
        a.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        fuz1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
          goto _L5
    }

    public void a(fuz fuz1, Uri uri, int i1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null) goto _L2; else goto _L1
_L1:
        fuz1 = fuz1.asBinder();
_L5:
        parcel.writeStrongBinder(fuz1);
        if (uri == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L6:
        parcel.writeInt(i1);
        a.transact(40, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        fuz1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
          goto _L5
    }

    public void a(fuz fuz1, Asset asset)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null) goto _L2; else goto _L1
_L1:
        fuz1 = fuz1.asBinder();
_L5:
        parcel.writeStrongBinder(fuz1);
        if (asset == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        asset.writeToParcel(parcel, 0);
_L6:
        a.transact(13, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        fuz1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
          goto _L5
    }

    public void a(fuz fuz1, ConnectionConfiguration connectionconfiguration)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null) goto _L2; else goto _L1
_L1:
        fuz1 = fuz1.asBinder();
_L5:
        parcel.writeStrongBinder(fuz1);
        if (connectionconfiguration == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        connectionconfiguration.writeToParcel(parcel, 0);
_L6:
        a.transact(20, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        fuz1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
          goto _L5
    }

    public void a(fuz fuz1, PutDataRequest putdatarequest)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null) goto _L2; else goto _L1
_L1:
        fuz1 = fuz1.asBinder();
_L5:
        parcel.writeStrongBinder(fuz1);
        if (putdatarequest == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        putdatarequest.writeToParcel(parcel, 0);
_L6:
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        fuz1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
          goto _L5
    }

    public void a(fuz fuz1, AddListenerRequest addlistenerrequest)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null) goto _L2; else goto _L1
_L1:
        fuz1 = fuz1.asBinder();
_L5:
        parcel.writeStrongBinder(fuz1);
        if (addlistenerrequest == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        addlistenerrequest.writeToParcel(parcel, 0);
_L6:
        a.transact(16, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        fuz1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
          goto _L5
    }

    public void a(fuz fuz1, AncsNotificationParcelable ancsnotificationparcelable)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null) goto _L2; else goto _L1
_L1:
        fuz1 = fuz1.asBinder();
_L5:
        parcel.writeStrongBinder(fuz1);
        if (ancsnotificationparcelable == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        ancsnotificationparcelable.writeToParcel(parcel, 0);
_L6:
        a.transact(27, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        fuz1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
          goto _L5
    }

    public void a(fuz fuz1, RemoveListenerRequest removelistenerrequest)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null) goto _L2; else goto _L1
_L1:
        fuz1 = fuz1.asBinder();
_L5:
        parcel.writeStrongBinder(fuz1);
        if (removelistenerrequest == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        removelistenerrequest.writeToParcel(parcel, 0);
_L6:
        a.transact(17, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        fuz1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
          goto _L5
    }

    public void a(fuz fuz1, fuw fuw1, String s)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        fuz1 = obj;
        if (fuw1 == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        fuz1 = fuw1.asBinder();
        parcel.writeStrongBinder(fuz1);
        parcel.writeString(s);
        a.transact(34, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }

    public void a(fuz fuz1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        parcel.writeString(s);
        a.transact(21, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }

    public void a(fuz fuz1, String s, int i1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        parcel.writeString(s);
        parcel.writeInt(i1);
        a.transact(42, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }

    public void a(fuz fuz1, String s, ParcelFileDescriptor parcelfiledescriptor)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null) goto _L2; else goto _L1
_L1:
        fuz1 = fuz1.asBinder();
_L5:
        parcel.writeStrongBinder(fuz1);
        parcel.writeString(s);
        if (parcelfiledescriptor == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        parcelfiledescriptor.writeToParcel(parcel, 0);
_L6:
        a.transact(38, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        fuz1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
          goto _L5
    }

    public void a(fuz fuz1, String s, ParcelFileDescriptor parcelfiledescriptor, long l1, long l2)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null) goto _L2; else goto _L1
_L1:
        fuz1 = fuz1.asBinder();
_L5:
        parcel.writeStrongBinder(fuz1);
        parcel.writeString(s);
        if (parcelfiledescriptor == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        parcelfiledescriptor.writeToParcel(parcel, 0);
_L6:
        parcel.writeLong(l1);
        parcel.writeLong(l2);
        a.transact(39, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        fuz1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
          goto _L5
    }

    public void a(fuz fuz1, String s, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        parcel.writeString(s);
        parcel.writeString(s1);
        a.transact(31, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }

    public void a(fuz fuz1, String s, String s1, byte abyte0[])
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeByteArray(abyte0);
        a.transact(12, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }

    public void a(fuz fuz1, boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        a.transact(48, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }

    public IBinder asBinder()
    {
        return a;
    }

    public void b(fuz fuz1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        a.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }

    public void b(fuz fuz1, int i1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        parcel.writeInt(i1);
        a.transact(28, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }

    public void b(fuz fuz1, Uri uri)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null) goto _L2; else goto _L1
_L1:
        fuz1 = fuz1.asBinder();
_L5:
        parcel.writeStrongBinder(fuz1);
        if (uri == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L6:
        a.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        fuz1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
          goto _L5
    }

    public void b(fuz fuz1, Uri uri, int i1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null) goto _L2; else goto _L1
_L1:
        fuz1 = fuz1.asBinder();
_L5:
        parcel.writeStrongBinder(fuz1);
        if (uri == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L6:
        parcel.writeInt(i1);
        a.transact(41, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        fuz1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
          goto _L5
    }

    public void b(fuz fuz1, ConnectionConfiguration connectionconfiguration)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null) goto _L2; else goto _L1
_L1:
        fuz1 = fuz1.asBinder();
_L5:
        parcel.writeStrongBinder(fuz1);
        if (connectionconfiguration == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        connectionconfiguration.writeToParcel(parcel, 0);
_L6:
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        fuz1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
          goto _L5
    }

    public void b(fuz fuz1, fuw fuw1, String s)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        fuz1 = obj;
        if (fuw1 == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        fuz1 = fuw1.asBinder();
        parcel.writeStrongBinder(fuz1);
        parcel.writeString(s);
        a.transact(35, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }

    public void b(fuz fuz1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        parcel.writeString(s);
        a.transact(23, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }

    public void b(fuz fuz1, String s, int i1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        parcel.writeString(s);
        parcel.writeInt(i1);
        a.transact(33, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }

    public void b(fuz fuz1, boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        a.transact(50, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }

    public void c(fuz fuz1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        a.transact(14, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }

    public void c(fuz fuz1, int i1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        parcel.writeInt(i1);
        a.transact(29, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }

    public void c(fuz fuz1, Uri uri)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null) goto _L2; else goto _L1
_L1:
        fuz1 = fuz1.asBinder();
_L5:
        parcel.writeStrongBinder(fuz1);
        if (uri == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L6:
        a.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        fuz1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
          goto _L5
    }

    public void c(fuz fuz1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        parcel.writeString(s);
        a.transact(24, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }

    public void d(fuz fuz1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        a.transact(15, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }

    public void d(fuz fuz1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        parcel.writeString(s);
        a.transact(46, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }

    public void e(fuz fuz1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        a.transact(18, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }

    public void e(fuz fuz1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        parcel.writeString(s);
        a.transact(47, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }

    public void f(fuz fuz1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        a.transact(19, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }

    public void f(fuz fuz1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        parcel.writeString(s);
        a.transact(32, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }

    public void g(fuz fuz1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        a.transact(25, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }

    public void h(fuz fuz1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        a.transact(26, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }

    public void i(fuz fuz1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        a.transact(30, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }

    public void j(fuz fuz1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        a.transact(37, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }

    public void k(fuz fuz1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        a.transact(49, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }

    public void l(fuz fuz1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        a.transact(51, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }

    public void m(fuz fuz1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        a.transact(52, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }

    public void n(fuz fuz1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }

    public void o(fuz fuz1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }

    public void p(fuz fuz1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (fuz1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        fuz1 = fuz1.asBinder();
_L1:
        parcel.writeStrongBinder(fuz1);
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fuz1 = null;
          goto _L1
        fuz1;
        parcel1.recycle();
        parcel.recycle();
        throw fuz1;
    }
}
