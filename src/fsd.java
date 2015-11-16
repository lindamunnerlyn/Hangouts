// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.people.identity.internal.AccountToken;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;
import com.google.android.gms.people.identity.internal.ParcelableListOptions;
import com.google.android.gms.people.internal.ParcelableLoadImageOptions;
import com.google.android.gms.people.model.AvatarReference;
import java.util.List;

final class fsd
    implements fsb
{

    private IBinder a;

    fsd(IBinder ibinder)
    {
        a = ibinder;
    }

    public Bundle a(Uri uri)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (uri == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L3:
        a.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        uri = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return uri;
_L2:
        parcel.writeInt(0);
          goto _L3
        uri;
        parcel1.recycle();
        parcel.recycle();
        throw uri;
        uri = null;
          goto _L4
    }

    public Bundle a(fry fry1, boolean flag, String s, String s1, int i)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        int j;
        obj = null;
        j = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        if (flag)
        {
            j = 1;
        }
        parcel.writeInt(j);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeInt(i);
        a.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        fry1 = obj;
        if (parcel1.readInt() != 0)
        {
            fry1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
        }
        parcel1.recycle();
        parcel.recycle();
        return fry1;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public Bundle a(String s, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        parcel.writeString(s);
        parcel.writeString(s1);
        a.transact(12, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return s;
_L2:
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public Bundle a(String s, String s1, long l)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeLong(l);
        a.transact(20, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return s;
_L2:
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public Bundle a(String s, String s1, long l, boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeLong(l);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        a.transact(26, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return s;
_L2:
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public Bundle a(String s, String s1, long l, boolean flag, boolean flag1)
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeLong(l);
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (flag1)
        {
            i = ((flag2) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        a.transact(205, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return s;
_L2:
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public eqs a(fry fry1, DataHolder dataholder, int i, int j, long l)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null) goto _L2; else goto _L1
_L1:
        fry1 = fry1.asBinder();
_L5:
        parcel.writeStrongBinder(fry1);
        if (dataholder == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        dataholder.writeToParcel(parcel, 0);
_L6:
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeLong(l);
        a.transact(602, parcel, parcel1, 0);
        parcel1.readException();
        fry1 = eqt.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return fry1;
_L2:
        fry1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
          goto _L5
    }

    public eqs a(fry fry1, AccountToken accounttoken, ParcelableListOptions parcelablelistoptions)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null) goto _L2; else goto _L1
_L1:
        fry1 = fry1.asBinder();
_L5:
        parcel.writeStrongBinder(fry1);
        if (accounttoken == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        accounttoken.writeToParcel(parcel, 0);
_L6:
        if (parcelablelistoptions == null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        parcel.writeInt(1);
        parcelablelistoptions.writeToParcel(parcel, 0);
_L7:
        a.transact(601, parcel, parcel1, 0);
        parcel1.readException();
        fry1 = eqt.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return fry1;
_L2:
        fry1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
        parcel.writeInt(0);
          goto _L7
    }

    public eqs a(fry fry1, AvatarReference avatarreference, ParcelableLoadImageOptions parcelableloadimageoptions)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null) goto _L2; else goto _L1
_L1:
        fry1 = fry1.asBinder();
_L5:
        parcel.writeStrongBinder(fry1);
        if (avatarreference == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        avatarreference.writeToParcel(parcel, 0);
_L6:
        if (parcelableloadimageoptions == null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        parcel.writeInt(1);
        parcelableloadimageoptions.writeToParcel(parcel, 0);
_L7:
        a.transact(508, parcel, parcel1, 0);
        parcel1.readException();
        fry1 = eqt.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return fry1;
_L2:
        fry1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
        parcel.writeInt(0);
          goto _L7
    }

    public eqs a(fry fry1, String s, int i)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeInt(i);
        a.transact(509, parcel, parcel1, 0);
        parcel1.readException();
        fry1 = eqt.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return fry1;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public eqs a(fry fry1, String s, String s1, boolean flag, String s2, String s3, int i, 
            int j, int k, boolean flag1)
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeString(s1);
        int l;
        if (flag)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        parcel.writeInt(l);
        parcel.writeString(s2);
        parcel.writeString(s3);
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeInt(k);
        if (flag1)
        {
            i = ((flag2) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        a.transact(507, parcel, parcel1, 0);
        parcel1.readException();
        fry1 = eqt.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return fry1;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public void a(fry fry1, long l, boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeLong(l);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public void a(fry fry1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null) goto _L2; else goto _L1
_L1:
        fry1 = fry1.asBinder();
_L5:
        parcel.writeStrongBinder(fry1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(302, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        fry1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
          goto _L5
    }

    public void a(fry fry1, AccountToken accounttoken, List list, ParcelableGetOptions parcelablegetoptions)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null) goto _L2; else goto _L1
_L1:
        fry1 = fry1.asBinder();
_L5:
        parcel.writeStrongBinder(fry1);
        if (accounttoken == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        accounttoken.writeToParcel(parcel, 0);
_L6:
        parcel.writeStringList(list);
        if (parcelablegetoptions == null)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        parcel.writeInt(1);
        parcelablegetoptions.writeToParcel(parcel, 0);
_L7:
        a.transact(501, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        fry1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
        parcel.writeInt(0);
          goto _L7
    }

    public void a(fry fry1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        a.transact(24, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public void a(fry fry1, String s, int i, int j)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeInt(i);
        parcel.writeInt(j);
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public void a(fry fry1, String s, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeString(s1);
        a.transact(25, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public void a(fry fry1, String s, String s1, int i)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeInt(i);
        a.transact(403, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public void a(fry fry1, String s, String s1, int i, int j)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeInt(i);
        parcel.writeInt(j);
        a.transact(29, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public void a(fry fry1, String s, String s1, Uri uri)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null) goto _L2; else goto _L1
_L1:
        fry1 = fry1.asBinder();
_L5:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeString(s1);
        if (uri == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L6:
        a.transact(13, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        fry1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
          goto _L5
    }

    public void a(fry fry1, String s, String s1, Uri uri, boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null) goto _L2; else goto _L1
_L1:
        fry1 = fry1.asBinder();
_L5:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeString(s1);
        if (uri == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
        break MISSING_BLOCK_LABEL_138;
_L6:
        parcel.writeInt(i);
        a.transact(18, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        fry1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
        break MISSING_BLOCK_LABEL_138;
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
        while (!flag) 
        {
            i = 0;
            break;
        }
          goto _L6
    }

    public void a(fry fry1, String s, String s1, String s2)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        a.transact(204, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public void a(fry fry1, String s, String s1, String s2, int i, String s3)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeInt(i);
        parcel.writeString(s3);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public void a(fry fry1, String s, String s1, String s2, int i, String s3, boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag1;
        flag1 = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeInt(i);
        parcel.writeString(s3);
        i = ((flag1) ? 1 : 0);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        a.transact(19, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public void a(fry fry1, String s, String s1, String s2, int i, boolean flag, int j, 
            int k, String s3)
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag1;
        flag1 = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeInt(i);
        i = ((flag1) ? 1 : 0);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeInt(k);
        parcel.writeString(s3);
        a.transact(202, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public void a(fry fry1, String s, String s1, String s2, int i, boolean flag, int j, 
            int k, String s3, boolean flag1)
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeInt(i);
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeInt(k);
        parcel.writeString(s3);
        if (flag1)
        {
            i = ((flag2) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        a.transact(203, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public void a(fry fry1, String s, String s1, String s2, int i, boolean flag, int j, 
            int k, String s3, boolean flag1, int l, int i1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeInt(i);
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeInt(k);
        parcel.writeString(s3);
        if (flag1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeInt(l);
        parcel.writeInt(i1);
        a.transact(402, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public void a(fry fry1, String s, String s1, String s2, String s3)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeString(s3);
        a.transact(27, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public void a(fry fry1, String s, String s1, String s2, String s3, int i, String s4)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeString(s3);
        parcel.writeInt(i);
        parcel.writeString(s4);
        a.transact(303, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public void a(fry fry1, String s, String s1, String s2, String s3, boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeString(s3);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        a.transact(701, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public void a(fry fry1, String s, String s1, String s2, List list)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringList(list);
        a.transact(28, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public void a(fry fry1, String s, String s1, String s2, List list, int i, boolean flag, 
            long l)
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag1;
        flag1 = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringList(list);
        parcel.writeInt(i);
        i = ((flag1) ? 1 : 0);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        parcel.writeLong(l);
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public void a(fry fry1, String s, String s1, String s2, List list, int i, boolean flag, 
            long l, String s3, int j)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringList(list);
        parcel.writeInt(i);
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeLong(l);
        parcel.writeString(s3);
        parcel.writeInt(j);
        a.transact(21, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public void a(fry fry1, String s, String s1, String s2, List list, int i, boolean flag, 
            long l, String s3, int j, int k)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringList(list);
        parcel.writeInt(i);
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeLong(l);
        parcel.writeString(s3);
        parcel.writeInt(j);
        parcel.writeInt(k);
        a.transact(401, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public void a(fry fry1, String s, String s1, String s2, List list, int i, boolean flag, 
            long l, String s3, int j, int k, int i1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringList(list);
        parcel.writeInt(i);
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeLong(l);
        parcel.writeString(s3);
        parcel.writeInt(j);
        parcel.writeInt(k);
        parcel.writeInt(i1);
        a.transact(404, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public void a(fry fry1, String s, String s1, String s2, List list, List list1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringList(list);
        parcel.writeStringList(list1);
        a.transact(14, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public void a(fry fry1, String s, String s1, String s2, List list, List list1, FavaDiagnosticsEntity favadiagnosticsentity)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null) goto _L2; else goto _L1
_L1:
        fry1 = fry1.asBinder();
_L5:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringList(list);
        parcel.writeStringList(list1);
        if (favadiagnosticsentity == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        favadiagnosticsentity.writeToParcel(parcel, 0);
_L6:
        a.transact(23, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        fry1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
          goto _L5
    }

    public void a(fry fry1, String s, String s1, String s2, boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        a.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public void a(fry fry1, String s, String s1, String s2, boolean flag, int i)
    {
        Parcel parcel;
        Parcel parcel1;
        int j;
        j = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        if (flag)
        {
            j = 1;
        }
        parcel.writeInt(j);
        parcel.writeInt(i);
        a.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public void a(fry fry1, String s, String s1, String s2, boolean flag, int i, int j)
    {
        Parcel parcel;
        Parcel parcel1;
        int k;
        k = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        if (flag)
        {
            k = 1;
        }
        parcel.writeInt(k);
        parcel.writeInt(i);
        parcel.writeInt(j);
        a.transact(201, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public void a(fry fry1, String s, boolean flag, String as[])
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        parcel.writeStringArray(as);
        a.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public void a(fry fry1, boolean flag, boolean flag1, String s, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (flag1)
        {
            i = ((flag2) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeString(s);
        parcel.writeString(s1);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public void a(fry fry1, boolean flag, boolean flag1, String s, String s1, int i)
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        int j;
        if (flag)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        parcel.writeInt(j);
        if (flag1)
        {
            j = ((flag2) ? 1 : 0);
        } else
        {
            j = 0;
        }
        parcel.writeInt(j);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeInt(i);
        a.transact(305, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public void a(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        a.transact(15, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public boolean a()
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        a.transact(16, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        if (i != 0)
        {
            flag = true;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public IBinder asBinder()
    {
        return a;
    }

    public Bundle b(String s, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        parcel.writeString(s);
        parcel.writeString(s1);
        a.transact(17, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return s;
_L2:
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public eqs b(fry fry1, long l, boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeLong(l);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        a.transact(503, parcel, parcel1, 0);
        parcel1.readException();
        fry1 = eqt.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return fry1;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public eqs b(fry fry1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        a.transact(504, parcel, parcel1, 0);
        parcel1.readException();
        fry1 = eqt.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return fry1;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public eqs b(fry fry1, String s, int i, int j)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeInt(i);
        parcel.writeInt(j);
        a.transact(502, parcel, parcel1, 0);
        parcel1.readException();
        fry1 = eqt.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return fry1;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public eqs b(fry fry1, String s, String s1, int i, int j)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeInt(i);
        parcel.writeInt(j);
        a.transact(505, parcel, parcel1, 0);
        parcel1.readException();
        fry1 = eqt.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return fry1;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public void b(fry fry1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null) goto _L2; else goto _L1
_L1:
        fry1 = fry1.asBinder();
_L5:
        parcel.writeStrongBinder(fry1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(304, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        fry1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
          goto _L5
    }

    public void b(fry fry1, String s, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeString(s1);
        a.transact(101, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public void b(fry fry1, String s, String s1, int i)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeInt(i);
        a.transact(301, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public void b(fry fry1, String s, String s1, String s2, int i, String s3)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeInt(i);
        parcel.writeString(s3);
        a.transact(22, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public void b(fry fry1, String s, String s1, String s2, boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        a.transact(603, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public eqs c(fry fry1, String s, String s1, int i)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeInt(i);
        a.transact(506, parcel, parcel1, 0);
        parcel1.readException();
        fry1 = eqt.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return fry1;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }

    public void c(fry fry1, String s, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
        if (fry1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        fry1 = fry1.asBinder();
_L1:
        parcel.writeStrongBinder(fry1);
        parcel.writeString(s);
        parcel.writeString(s1);
        a.transact(102, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fry1 = null;
          goto _L1
        fry1;
        parcel1.recycle();
        parcel.recycle();
        throw fry1;
    }
}
