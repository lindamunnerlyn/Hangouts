// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.people.identity.internal.AccountToken;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;
import com.google.android.gms.people.identity.internal.ParcelableListOptions;
import com.google.android.gms.people.internal.ParcelableLoadImageOptions;
import com.google.android.gms.people.model.AvatarReference;

public abstract class fsc extends Binder
    implements fsb
{

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        fry fry28;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.people.internal.IPeopleService");
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            fry fry = frz.a(parcel.readStrongBinder());
            boolean flag;
            boolean flag25;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (parcel.readInt() != 0)
            {
                flag25 = true;
            } else
            {
                flag25 = false;
            }
            a(fry, flag, flag25, parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 305: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            fry fry1 = frz.a(parcel.readStrongBinder());
            boolean flag1;
            boolean flag26;
            if (parcel.readInt() != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (parcel.readInt() != 0)
            {
                flag26 = true;
            } else
            {
                flag26 = false;
            }
            a(fry1, flag1, flag26, parcel.readString(), parcel.readString(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            a(frz.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            fry fry2 = frz.a(parcel.readStrongBinder());
            String s2 = parcel.readString();
            String s21 = parcel.readString();
            String s38 = parcel.readString();
            java.util.ArrayList arraylist1 = parcel.createStringArrayList();
            i = parcel.readInt();
            boolean flag2;
            if (parcel.readInt() != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            a(fry2, s2, s21, s38, arraylist1, i, flag2, parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            a(frz.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            fry fry3 = frz.a(parcel.readStrongBinder());
            long l1 = parcel.readLong();
            boolean flag3;
            if (parcel.readInt() != 0)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            a(fry3, l1, flag3);
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            fry fry4 = frz.a(parcel.readStrongBinder());
            String s3 = parcel.readString();
            String s22 = parcel.readString();
            String s39 = parcel.readString();
            boolean flag4;
            if (parcel.readInt() != 0)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            a(fry4, s3, s22, s39, flag4);
            parcel1.writeNoException();
            return true;

        case 603: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            fry fry5 = frz.a(parcel.readStrongBinder());
            String s4 = parcel.readString();
            String s23 = parcel.readString();
            String s40 = parcel.readString();
            boolean flag5;
            if (parcel.readInt() != 0)
            {
                flag5 = true;
            } else
            {
                flag5 = false;
            }
            b(fry5, s4, s23, s40, flag5);
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            if (parcel.readInt() != 0)
            {
                parcel = (Uri)Uri.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            parcel = a(parcel);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
            } else
            {
                parcel1.writeInt(0);
            }
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            fry fry6 = frz.a(parcel.readStrongBinder());
            String s5 = parcel.readString();
            String s24 = parcel.readString();
            String s41 = parcel.readString();
            boolean flag6;
            if (parcel.readInt() != 0)
            {
                flag6 = true;
            } else
            {
                flag6 = false;
            }
            a(fry6, s5, s24, s41, flag6, parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 201: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            fry fry7 = frz.a(parcel.readStrongBinder());
            String s6 = parcel.readString();
            String s25 = parcel.readString();
            String s42 = parcel.readString();
            boolean flag7;
            if (parcel.readInt() != 0)
            {
                flag7 = true;
            } else
            {
                flag7 = false;
            }
            a(fry7, s6, s25, s42, flag7, parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 202: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            fry fry8 = frz.a(parcel.readStrongBinder());
            String s7 = parcel.readString();
            String s26 = parcel.readString();
            String s43 = parcel.readString();
            i = parcel.readInt();
            boolean flag8;
            if (parcel.readInt() != 0)
            {
                flag8 = true;
            } else
            {
                flag8 = false;
            }
            a(fry8, s7, s26, s43, i, flag8, parcel.readInt(), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 203: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            fry fry9 = frz.a(parcel.readStrongBinder());
            String s8 = parcel.readString();
            String s27 = parcel.readString();
            String s44 = parcel.readString();
            i = parcel.readInt();
            String s54;
            int k;
            boolean flag9;
            boolean flag27;
            if (parcel.readInt() != 0)
            {
                flag9 = true;
            } else
            {
                flag9 = false;
            }
            j = parcel.readInt();
            k = parcel.readInt();
            s54 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                flag27 = true;
            } else
            {
                flag27 = false;
            }
            a(fry9, s8, s27, s44, i, flag9, j, k, s54, flag27);
            parcel1.writeNoException();
            return true;

        case 402: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            fry fry10 = frz.a(parcel.readStrongBinder());
            String s9 = parcel.readString();
            String s28 = parcel.readString();
            String s45 = parcel.readString();
            i = parcel.readInt();
            String s55;
            int l;
            boolean flag10;
            boolean flag28;
            if (parcel.readInt() != 0)
            {
                flag10 = true;
            } else
            {
                flag10 = false;
            }
            j = parcel.readInt();
            l = parcel.readInt();
            s55 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                flag28 = true;
            } else
            {
                flag28 = false;
            }
            a(fry10, s9, s28, s45, i, flag10, j, l, s55, flag28, parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            fry fry11 = frz.a(parcel.readStrongBinder());
            String s10 = parcel.readString();
            boolean flag11;
            if (parcel.readInt() != 0)
            {
                flag11 = true;
            } else
            {
                flag11 = false;
            }
            a(fry11, s10, flag11, parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            fry fry12 = frz.a(parcel.readStrongBinder());
            boolean flag12;
            if (parcel.readInt() != 0)
            {
                flag12 = true;
            } else
            {
                flag12 = false;
            }
            parcel = a(fry12, flag12, parcel.readString(), parcel.readString(), parcel.readInt());
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
            } else
            {
                parcel1.writeInt(0);
            }
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            parcel = a(parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
            } else
            {
                parcel1.writeInt(0);
            }
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            fry fry13 = frz.a(parcel.readStrongBinder());
            String s11 = parcel.readString();
            String s29 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Uri)Uri.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(fry13, s11, s29, parcel);
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            a(frz.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList());
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            boolean flag13;
            if (parcel.readInt() != 0)
            {
                flag13 = true;
            } else
            {
                flag13 = false;
            }
            a(flag13);
            parcel1.writeNoException();
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            boolean flag14 = a();
            parcel1.writeNoException();
            if (flag14)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel1.writeInt(i);
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            parcel = b(parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
            } else
            {
                parcel1.writeInt(0);
            }
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            fry fry24 = frz.a(parcel.readStrongBinder());
            String s30 = parcel.readString();
            String s46 = parcel.readString();
            Uri uri;
            boolean flag15;
            if (parcel.readInt() != 0)
            {
                uri = (Uri)Uri.CREATOR.createFromParcel(parcel);
            } else
            {
                uri = null;
            }
            if (parcel.readInt() != 0)
            {
                flag15 = true;
            } else
            {
                flag15 = false;
            }
            a(fry24, s30, s46, uri, flag15);
            parcel1.writeNoException();
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            fry fry14 = frz.a(parcel.readStrongBinder());
            String s12 = parcel.readString();
            String s31 = parcel.readString();
            String s47 = parcel.readString();
            i = parcel.readInt();
            String s56 = parcel.readString();
            boolean flag16;
            if (parcel.readInt() != 0)
            {
                flag16 = true;
            } else
            {
                flag16 = false;
            }
            a(fry14, s12, s31, s47, i, s56, flag16);
            parcel1.writeNoException();
            return true;

        case 20: // '\024'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            parcel = a(parcel.readString(), parcel.readString(), parcel.readLong());
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
            } else
            {
                parcel1.writeInt(0);
            }
            return true;

        case 21: // '\025'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            fry fry15 = frz.a(parcel.readStrongBinder());
            String s13 = parcel.readString();
            String s32 = parcel.readString();
            String s48 = parcel.readString();
            java.util.ArrayList arraylist2 = parcel.createStringArrayList();
            i = parcel.readInt();
            boolean flag17;
            if (parcel.readInt() != 0)
            {
                flag17 = true;
            } else
            {
                flag17 = false;
            }
            a(fry15, s13, s32, s48, arraylist2, i, flag17, parcel.readLong(), parcel.readString(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 401: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            fry fry16 = frz.a(parcel.readStrongBinder());
            String s14 = parcel.readString();
            String s33 = parcel.readString();
            String s49 = parcel.readString();
            java.util.ArrayList arraylist3 = parcel.createStringArrayList();
            i = parcel.readInt();
            boolean flag18;
            if (parcel.readInt() != 0)
            {
                flag18 = true;
            } else
            {
                flag18 = false;
            }
            a(fry16, s14, s33, s49, arraylist3, i, flag18, parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 404: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            fry fry17 = frz.a(parcel.readStrongBinder());
            String s15 = parcel.readString();
            String s34 = parcel.readString();
            String s50 = parcel.readString();
            java.util.ArrayList arraylist4 = parcel.createStringArrayList();
            i = parcel.readInt();
            boolean flag19;
            if (parcel.readInt() != 0)
            {
                flag19 = true;
            } else
            {
                flag19 = false;
            }
            a(fry17, s15, s34, s50, arraylist4, i, flag19, parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 22: // '\026'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            b(frz.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 23: // '\027'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            fry fry18 = frz.a(parcel.readStrongBinder());
            String s16 = parcel.readString();
            String s35 = parcel.readString();
            String s51 = parcel.readString();
            java.util.ArrayList arraylist5 = parcel.createStringArrayList();
            java.util.ArrayList arraylist6 = parcel.createStringArrayList();
            if (parcel.readInt() != 0)
            {
                eri eri1 = FavaDiagnosticsEntity.CREATOR;
                parcel = eri.a(parcel);
            } else
            {
                parcel = null;
            }
            a(fry18, s16, s35, s51, arraylist5, arraylist6, parcel);
            parcel1.writeNoException();
            return true;

        case 24: // '\030'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            a(frz.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 25: // '\031'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            a(frz.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 403: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            a(frz.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 26: // '\032'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            String s = parcel.readString();
            String s17 = parcel.readString();
            long l2 = parcel.readLong();
            boolean flag20;
            if (parcel.readInt() != 0)
            {
                flag20 = true;
            } else
            {
                flag20 = false;
            }
            parcel = a(s, s17, l2, flag20);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
            } else
            {
                parcel1.writeInt(0);
            }
            return true;

        case 205: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            String s1 = parcel.readString();
            String s18 = parcel.readString();
            long l3 = parcel.readLong();
            boolean flag21;
            boolean flag29;
            if (parcel.readInt() != 0)
            {
                flag21 = true;
            } else
            {
                flag21 = false;
            }
            if (parcel.readInt() != 0)
            {
                flag29 = true;
            } else
            {
                flag29 = false;
            }
            parcel = a(s1, s18, l3, flag21, flag29);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
            } else
            {
                parcel1.writeInt(0);
            }
            return true;

        case 101: // 'e'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            b(frz.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 102: // 'f'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            c(frz.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 27: // '\033'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            a(frz.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 701: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            fry fry19 = frz.a(parcel.readStrongBinder());
            String s19 = parcel.readString();
            String s36 = parcel.readString();
            String s52 = parcel.readString();
            String s57 = parcel.readString();
            boolean flag22;
            if (parcel.readInt() != 0)
            {
                flag22 = true;
            } else
            {
                flag22 = false;
            }
            a(fry19, s19, s36, s52, s57, flag22);
            parcel1.writeNoException();
            return true;

        case 28: // '\034'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            a(frz.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            parcel1.writeNoException();
            return true;

        case 29: // '\035'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            a(frz.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 204: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            a(frz.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 301: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            b(frz.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 302: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            fry fry20 = frz.a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(fry20, parcel);
            parcel1.writeNoException();
            return true;

        case 303: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            a(frz.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 304: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            fry fry21 = frz.a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            b(fry21, parcel);
            parcel1.writeNoException();
            return true;

        case 501: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            fry fry25 = frz.a(parcel.readStrongBinder());
            Object obj;
            java.util.ArrayList arraylist;
            if (parcel.readInt() != 0)
            {
                obj = AccountToken.CREATOR;
                obj = fqv.a(parcel);
            } else
            {
                obj = null;
            }
            arraylist = parcel.createStringArrayList();
            if (parcel.readInt() != 0)
            {
                fra fra1 = ParcelableGetOptions.CREATOR;
                parcel = fra.a(parcel);
            } else
            {
                parcel = null;
            }
            a(fry25, ((AccountToken) (obj)), arraylist, parcel);
            parcel1.writeNoException();
            return true;

        case 502: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            parcel = b(frz.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel = parcel.asBinder();
            } else
            {
                parcel = null;
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 503: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            fry fry22 = frz.a(parcel.readStrongBinder());
            long l4 = parcel.readLong();
            boolean flag23;
            if (parcel.readInt() != 0)
            {
                flag23 = true;
            } else
            {
                flag23 = false;
            }
            parcel = b(fry22, l4, flag23);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel = parcel.asBinder();
            } else
            {
                parcel = null;
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 504: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            parcel = b(frz.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel = parcel.asBinder();
            } else
            {
                parcel = null;
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 505: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            parcel = b(frz.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel = parcel.asBinder();
            } else
            {
                parcel = null;
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 506: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            parcel = c(frz.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt());
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel = parcel.asBinder();
            } else
            {
                parcel = null;
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 507: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            fry fry23 = frz.a(parcel.readStrongBinder());
            String s20 = parcel.readString();
            String s37 = parcel.readString();
            String s53;
            String s58;
            int i1;
            boolean flag24;
            boolean flag30;
            if (parcel.readInt() != 0)
            {
                flag24 = true;
            } else
            {
                flag24 = false;
            }
            s53 = parcel.readString();
            s58 = parcel.readString();
            i = parcel.readInt();
            j = parcel.readInt();
            i1 = parcel.readInt();
            if (parcel.readInt() != 0)
            {
                flag30 = true;
            } else
            {
                flag30 = false;
            }
            parcel = a(fry23, s20, s37, flag24, s53, s58, i, j, i1, flag30);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel = parcel.asBinder();
            } else
            {
                parcel = null;
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 508: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            fry fry26 = frz.a(parcel.readStrongBinder());
            Object obj1;
            if (parcel.readInt() != 0)
            {
                obj1 = AvatarReference.CREATOR;
                obj1 = ftn.a(parcel);
            } else
            {
                obj1 = null;
            }
            if (parcel.readInt() != 0)
            {
                fsh fsh1 = ParcelableLoadImageOptions.CREATOR;
                parcel = fsh.a(parcel);
            } else
            {
                parcel = null;
            }
            parcel = a(fry26, ((AvatarReference) (obj1)), parcel);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel = parcel.asBinder();
            } else
            {
                parcel = null;
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 509: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            parcel = a(frz.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel = parcel.asBinder();
            } else
            {
                parcel = null;
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 601: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            fry fry27 = frz.a(parcel.readStrongBinder());
            Object obj2;
            if (parcel.readInt() != 0)
            {
                obj2 = AccountToken.CREATOR;
                obj2 = fqv.a(parcel);
            } else
            {
                obj2 = null;
            }
            if (parcel.readInt() != 0)
            {
                frb frb1 = ParcelableListOptions.CREATOR;
                parcel = frb.a(parcel);
            } else
            {
                parcel = null;
            }
            parcel = a(fry27, ((AccountToken) (obj2)), parcel);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel = parcel.asBinder();
            } else
            {
                parcel = null;
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 602: 
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
            fry28 = frz.a(parcel.readStrongBinder());
            break;
        }
        Object obj3;
        if (parcel.readInt() != 0)
        {
            obj3 = DataHolder.CREATOR;
            obj3 = eph.a(parcel);
        } else
        {
            obj3 = null;
        }
        parcel = a(fry28, ((DataHolder) (obj3)), parcel.readInt(), parcel.readInt(), parcel.readLong());
        parcel1.writeNoException();
        if (parcel != null)
        {
            parcel = parcel.asBinder();
        } else
        {
            parcel = null;
        }
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}
