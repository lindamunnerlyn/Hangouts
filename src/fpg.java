// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.people.identity.internal.AccountToken;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;
import com.google.android.gms.people.identity.internal.ParcelableListOptions;
import com.google.android.gms.people.internal.ParcelableLoadImageOptions;
import com.google.android.gms.people.model.AvatarReference;
import java.util.List;

public interface fpg
    extends IInterface
{

    public abstract Bundle a(Uri uri);

    public abstract Bundle a(fpd fpd, boolean flag, String s, String s1, int i);

    public abstract Bundle a(String s, String s1);

    public abstract Bundle a(String s, String s1, long l);

    public abstract Bundle a(String s, String s1, long l, boolean flag);

    public abstract Bundle a(String s, String s1, long l, boolean flag, boolean flag1);

    public abstract ens a(fpd fpd, DataHolder dataholder, int i, int j, long l);

    public abstract ens a(fpd fpd, AccountToken accounttoken, ParcelableListOptions parcelablelistoptions);

    public abstract ens a(fpd fpd, AvatarReference avatarreference, ParcelableLoadImageOptions parcelableloadimageoptions);

    public abstract ens a(fpd fpd, String s, int i);

    public abstract ens a(fpd fpd, String s, String s1, boolean flag, String s2, String s3, int i, 
            int j, int k, boolean flag1);

    public abstract void a(fpd fpd, long l, boolean flag);

    public abstract void a(fpd fpd, Bundle bundle);

    public abstract void a(fpd fpd, AccountToken accounttoken, List list, ParcelableGetOptions parcelablegetoptions);

    public abstract void a(fpd fpd, String s);

    public abstract void a(fpd fpd, String s, int i, int j);

    public abstract void a(fpd fpd, String s, String s1);

    public abstract void a(fpd fpd, String s, String s1, int i);

    public abstract void a(fpd fpd, String s, String s1, int i, int j);

    public abstract void a(fpd fpd, String s, String s1, Uri uri);

    public abstract void a(fpd fpd, String s, String s1, Uri uri, boolean flag);

    public abstract void a(fpd fpd, String s, String s1, String s2);

    public abstract void a(fpd fpd, String s, String s1, String s2, int i, String s3);

    public abstract void a(fpd fpd, String s, String s1, String s2, int i, String s3, boolean flag);

    public abstract void a(fpd fpd, String s, String s1, String s2, int i, boolean flag, int j, 
            int k, String s3);

    public abstract void a(fpd fpd, String s, String s1, String s2, int i, boolean flag, int j, 
            int k, String s3, boolean flag1);

    public abstract void a(fpd fpd, String s, String s1, String s2, int i, boolean flag, int j, 
            int k, String s3, boolean flag1, int l, int i1);

    public abstract void a(fpd fpd, String s, String s1, String s2, String s3);

    public abstract void a(fpd fpd, String s, String s1, String s2, String s3, int i, String s4);

    public abstract void a(fpd fpd, String s, String s1, String s2, String s3, boolean flag);

    public abstract void a(fpd fpd, String s, String s1, String s2, List list);

    public abstract void a(fpd fpd, String s, String s1, String s2, List list, int i, boolean flag, 
            long l);

    public abstract void a(fpd fpd, String s, String s1, String s2, List list, int i, boolean flag, 
            long l, String s3, int j);

    public abstract void a(fpd fpd, String s, String s1, String s2, List list, int i, boolean flag, 
            long l, String s3, int j, int k);

    public abstract void a(fpd fpd, String s, String s1, String s2, List list, int i, boolean flag, 
            long l, String s3, int j, int k, int i1);

    public abstract void a(fpd fpd, String s, String s1, String s2, List list, List list1);

    public abstract void a(fpd fpd, String s, String s1, String s2, List list, List list1, FavaDiagnosticsEntity favadiagnosticsentity);

    public abstract void a(fpd fpd, String s, String s1, String s2, boolean flag);

    public abstract void a(fpd fpd, String s, String s1, String s2, boolean flag, int i);

    public abstract void a(fpd fpd, String s, String s1, String s2, boolean flag, int i, int j);

    public abstract void a(fpd fpd, String s, boolean flag, String as[]);

    public abstract void a(fpd fpd, boolean flag, boolean flag1, String s, String s1);

    public abstract void a(fpd fpd, boolean flag, boolean flag1, String s, String s1, int i);

    public abstract void a(boolean flag);

    public abstract boolean a();

    public abstract Bundle b(String s, String s1);

    public abstract ens b(fpd fpd, long l, boolean flag);

    public abstract ens b(fpd fpd, String s);

    public abstract ens b(fpd fpd, String s, int i, int j);

    public abstract ens b(fpd fpd, String s, String s1, int i, int j);

    public abstract void b(fpd fpd, Bundle bundle);

    public abstract void b(fpd fpd, String s, String s1);

    public abstract void b(fpd fpd, String s, String s1, int i);

    public abstract void b(fpd fpd, String s, String s1, String s2, int i, String s3);

    public abstract void b(fpd fpd, String s, String s1, String s2, boolean flag);

    public abstract ens c(fpd fpd, String s, String s1, int i);

    public abstract void c(fpd fpd, String s, String s1);
}
